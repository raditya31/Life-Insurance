package com.cybage.genworth.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.genworth.insurance.model.User;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{
public User  findByUsername(String username);
public List<User> findByCity(String city);
}
