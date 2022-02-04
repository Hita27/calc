package com.mnemo.calculator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CalculatorController {
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result add(@RequestBody Operands operands) {
//		return operationsService.add(operands);
		return null;
	}
	
	@PostMapping(value = "/subtract", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result subtract(@RequestBody Operands operands) {
//		return operationsService.subtract(operands);
		return null;
	}
	
	@PostMapping(value = "/multiply", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result multiply(@RequestBody Operands operands) {
//		return operationsService.multiply(operands);
		return null;
	}
	
	@PostMapping(value = "/divide", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result divide(@RequestBody Operands operands) {
//		return operationsService.divide(operands);
		return null;
	}
}
