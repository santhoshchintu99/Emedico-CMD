package com.Emedico.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Emedico.Entity.Address;
import com.Emedico.Service.AddressService;

@RestController
@RequestMapping("/api/ adddress")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
  public String apiName() {
	return "Address API";
  }
  
  @GetMapping("/findAll")
  public ResponseEntity<List<Address>> findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(addressService.findAll());
  }
	
	
	
	
}
