package com.cybage.genworth.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.genworth.insurance.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
