package de.telran.service;

import de.telran.dao.RoleRepository;
import de.telran.dao.UserRepository;
import de.telran.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;
public class DbUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public DbUserDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(username).orElseThrow();
        return new DbUser(user, roleRepository.findAllByUserId(user.getId()));
    }

    public static class DbUser implements UserDetails {
        private String password;
        private String login;
        private List<? extends GrantedAuthority> authorityList;

        public DbUser(User user, List<? extends GrantedAuthority> authorityList) {
            this.password = user.getPassword();
            this.login = user.getEmail();
            this.authorityList = authorityList;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return authorityList;
        }

        @Override
        public String getPassword() {
            return password;
        }

        @Override
        public String getUsername() {
            return login;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
