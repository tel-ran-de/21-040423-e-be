package de.telran;

import de.telran.controller.UserController;
import de.telran.dao.UserRepository;
import de.telran.model.User;
import de.telran.service.JwtService;
import io.jsonwebtoken.Claims;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserRepository userRepository;

    @MockBean
    JwtService jwtService;

//    @Test
//    public void createUserWithIncorrectEmailShouldReturn400() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/create")
//                .param("email","invalid.test"))
//                .andExpect(MockMvcResultMatchers.status().isBadRequest())
//                .andExpect(MockMvcResultMatchers.content().json("{email:\"невалидный емаил\"}"));
//
//    }

    @Test
    @Disabled
    public void createUserWithCorrectEmailShouldReturn400() throws Exception {
        Mockito.when(userRepository.save(Mockito.any()))
                .thenReturn(new User("Test",1,1,"valid@test.com"));
        Mockito.when(jwtService.validate(Mockito.eq("test"))).thenReturn(new Claims() {
            @Override
            public String getIssuer() {
                return null;
            }

            @Override
            public String getSubject() {
                return "test";
            }

            @Override
            public Set<String> getAudience() {
                return null;
            }

            @Override
            public Date getExpiration() {
                return null;
            }

            @Override
            public Date getNotBefore() {
                return null;
            }

            @Override
            public Date getIssuedAt() {
                return null;
            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public <T> T get(String claimName, Class<T> requiredType) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return List.of("ADMIN", "USER");
            }

            @Override
            public Object put(String key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ?> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Object> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Object>> entrySet() {
                return null;
            }
        });
        mockMvc.perform(MockMvcRequestBuilders.get("/create")
                        .header("Authorization", "Bearer test")
                        .param("email","valid@test.com"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(StringContains.containsString("valid@test.com")));

    }
}
