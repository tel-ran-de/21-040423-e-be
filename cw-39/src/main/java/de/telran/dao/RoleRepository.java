package de.telran.dao;


import de.telran.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    List<Role> findAllByUserId(Integer userId);
}
