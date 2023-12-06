package org.perscholas.springboot.database.dao;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.database.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {

    public User findById(int id);
    @Query("SELECT u FROM User u WHERE u.email LIKE :email AND u.password LIKE :password")
    List<User> findByemailandpassword(String email, String password);
}




