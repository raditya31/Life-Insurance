package com.cybage.genworth.insurance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.genworth.insurance.factory.FactoryLifeGeneralInsurance;
import com.cybage.genworth.insurance.factory.InsuranceTypeService;
import com.cybage.genworth.insurance.model.Policy;
import com.cybage.genworth.insurance.repository.PolicyRepository;
import com.cybage.genworth.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Iterable<Policy> getAllPolicy() {
		List<Policy> allPolicies = policyRepository.findAll();
		return allPolicies;
	}

	@Override
	public Policy savePolicy(Policy policy) {
		InsuranceTypeService insuranceType = FactoryLifeGeneralInsurance.getUserType(policy.getStatus());
		if (insuranceType == null) {
			throw new IllegalArgumentException("Invalid insurance type: " + policy.getStatus());
		}
		
		Policy savePolicy = policyRepository.save(policy);
		  System.out.println("Creating policy for " + insuranceType.getInsuranceType());
		return savePolicy;
	}

	@Override
	public Policy getPolicyById(Integer Id) {
		Policy policy = policyRepository.findById(Id).get();
		return policy;
	}

	@Override
	public void deletePolicy(Integer id) {
		policyRepository.deleteById(id);
	}

}
