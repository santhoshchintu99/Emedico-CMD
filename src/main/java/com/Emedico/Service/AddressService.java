package com.Emedico.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emedico.Entity.Address;
import com.Emedico.Repository.AddressRepository;

@Service
public class AddressService  {
    @Autowired
	private AddressRepository addressRepository;
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	public Address findById(Integer aid) {
		return addressRepository.getById(aid);
	}

	public Address save(Address address) {
		return addressRepository.save(address);
	}

	public Address update(Address address) {
		return addressRepository.save(address);
	}

	public void deleteById(Integer aid) {
		addressRepository.deleteById(aid);
	}

}
