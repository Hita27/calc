package com.mnemo.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Operation;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CalculatorController {
	
	@Autowired
    private OperationsService operationsService;
	
	@PostMapping(value = "/calculate", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result calculate(@RequestBody List<Operation> operations) {
		//TODO
		return null;
//		La idea es extender el API haciendole capaz de recibir una lista de operaciones 
//		(que no tiene porque ser la misma) y con algun tipo de palabra clave en los operandos
//		que sea capaz de concatenar esas operaciones recibidas en la lista para ofrecer un unico resultado.
//		Ejemplo:
//		{
//			[
//			 {
//				 "operation": "add",
//				 "operands": {
//				 	"firstOperand":2,
//				 	"secondOperand":3
//			 	}
//			 },
//			 {
//				 "operation": "subtract",
//				 "operands": {
//				 	"firstOperand":"result1",
//				 	"secondOperand":4
//			 	}
//			 }
//			]
//		}
//		En este ejemplo las operaciones a realizar serian 2+3 = 5 y despues 5-4 con un resultado final de 1. 
	}
	
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
