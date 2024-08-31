package com.cybage.genworth.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.Address;
import com.cybage.genworth.insurance.model.Employee;
import com.cybage.genworth.insurance.service.AddressService;
import com.cybage.genworth.insurance.service.EmployeeService;

@RestController
@RequestMapping("/insurance/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AddressService addressService;
	
@PostMapping("/")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	Employee emp = employeeService.saveEmployee(employee);
	List<Address> addresses = employee.getAddresses();
	for(Address add:addresses) {
		addressService.saveAddress(add);
	}
	return new ResponseEntity<>(emp,HttpStatus.CREATED);
}
}
