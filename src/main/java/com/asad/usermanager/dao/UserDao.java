package com.asad.usermanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.asad.usermanager.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    @Modifying
    @Query(value = "INSERT INTO userd (name, email, phone, dob, gender, city, state, country) VALUES (:#{#user.name}, :#{#user.email}, :#{#user.phone}, :#{#user.dob}, :#{#user.gender}, :#{#user.city}, :#{#user.state}, :#{#user.country})", nativeQuery = true)
    void insertUser(@Param("user") User user);
}
