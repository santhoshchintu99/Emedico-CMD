package com.Emedico.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Emedico.Entity.Specilaization;
import com.Emedico.Service.Specilaizationservice;

@RestController
@RequestMapping("/api/Specilaization")
public class SpecilaizationController {
	@Autowired
	private Specilaizationservice specilaizationService;

	public String apiName() {
		return "Qualification API";
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Specilaization>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(specilaizationService.findAll());
	}

	@GetMapping("/findById/{sid}")
	public ResponseEntity<Specilaization> findById(Integer sid) {
		return ResponseEntity.status(HttpStatus.OK).body(specilaizationService.findById(sid));
	}
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Specilaization> save(@RequestBody Specilaization specialization) {
		return ResponseEntity.status(HttpStatus.CREATED).body(specilaizationService.save(specialization));
	}

	@PutMapping("/update")
	public ResponseEntity<Specilaization> update(@RequestBody Specilaization specialization) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(specilaizationService.save(specialization));
	}

	@DeleteMapping("/deleteById/{sid}")
	public ResponseEntity<?> deleteById(Integer sid) {
		specilaizationService.deleteById(sid);
		Map<String, String> responseMap = new HashMap<String, String>() {
			{
				put("response", "Deleted Successfully");
			}
		};
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMap);
	}

}
