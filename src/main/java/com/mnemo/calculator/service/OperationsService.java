package com.mnemo.calculator.service;

import java.util.List;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Operation;
import com.mnemo.calculator.model.Result;

public interface OperationsService {
	
	Result calculate(List<Operation> operations);
	
	Result add(Operands operands);
	
	Result subtract(Operands operands);
	
	Result multiply(Operands operands);
	
	Result divide(Operands operands);

}
