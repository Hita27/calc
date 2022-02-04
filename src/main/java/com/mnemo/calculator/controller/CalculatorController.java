package com.mnemo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CalculatorController {
	
	@Autowired
    private OperationsService operationsService;
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result add(@RequestBody Operands operands) {
		return operationsService.add(operands);
	}
	
	@PostMapping(value = "/subtract", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result subtract(@RequestBody Operands operands) {
		return operationsService.subtract(operands);
	}
	
	@PostMapping(value = "/multiply", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result multiply(@RequestBody Operands operands) {
		return operationsService.multiply(operands);
	}
	
	@PostMapping(value = "/divide", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result divide(@RequestBody Operands operands) {
		return operationsService.divide(operands);
	}
}
