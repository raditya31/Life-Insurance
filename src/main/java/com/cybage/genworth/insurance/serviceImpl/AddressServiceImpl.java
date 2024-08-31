package com.cybage.genworth.insurance.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.genworth.insurance.model.Address;
import com.cybage.genworth.insurance.repository.AddressRepository;
import com.cybage.genworth.insurance.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
@Autowired
private AddressRepository addressRepository;

@Override
public Address saveAddress(Address address) {
	Address saveaAddress = addressRepository.save(address);
	return saveaAddress;
}
	


}
