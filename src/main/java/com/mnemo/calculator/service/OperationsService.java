package com.mnemo.calculator.service;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;

public interface OperationsService {
	
	Result add(Operands operands);
	
	Result subtract(Operands operands);
	
	Result multiply(Operands operands);
	
	Result divide(Operands operands);

}
