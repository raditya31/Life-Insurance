package com.cybage.genworth.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.Policy;
import com.cybage.genworth.insurance.service.PolicyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/insurance/policy")
@Slf4j
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@PostMapping("/")
	public Policy savePolicy(@RequestBody Policy policy) {
		log.info("into the save policy controller");
		Policy savePolicy = policyService.savePolicy(policy);
		return savePolicy;
	}

	@GetMapping("/{Id}")
	public Policy getPolicyById(@PathVariable Integer Id) {
		Policy policyById = policyService.getPolicyById(Id);
		return policyById;
	}

	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable Integer id) {
		policyService.deletePolicy(id);
	}
}
