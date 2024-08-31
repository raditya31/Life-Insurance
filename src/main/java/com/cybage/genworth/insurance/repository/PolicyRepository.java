package com.cybage.genworth.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.genworth.insurance.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Serializable> {
	

}
