package com.cybage.genworth.insurance.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.genworth.insurance.model.Employee;
import com.cybage.genworth.insurance.repository.EmployeeRepository;
import com.cybage.genworth.insurance.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee saveemEmployee = employeeRepository.save(employee);
		return saveemEmployee;
	}

}
