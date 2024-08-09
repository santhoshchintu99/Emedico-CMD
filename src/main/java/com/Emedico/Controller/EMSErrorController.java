package com.Emedico.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Emedico.HosptialNotFoundException.HospitalNotFoundException;


@ControllerAdvice
public class EMSErrorController {
	@ExceptionHandler(HospitalNotFoundException.class)
	public ResponseEntity<?>hospitalNotFoundError(HospitalNotFoundException exception){
		Map<String, String>map=new HashMap<String, String>();
		map.put("error Msg", exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
}
