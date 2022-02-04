package com.mnemo.calculator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;
import com.mnemo.calculator.utils.BasicOperations;

import io.corp.calculator.TracerImpl;

@Service
public class OperationsServiceImpl implements OperationsService {

	@Autowired
	private TracerImpl tracer;
	
	@Override
	public Result add(Operands operands) {
		Result result = new Result(BasicOperations.add(operands.getFirstOperand(), operands.getSecondOperand()));
		tracer.trace(result);
		return result;
	}

	@Override
	public Result subtract(Operands operands) {
		Result result = new Result(BasicOperations.subtract(operands.getFirstOperand(), operands.getSecondOperand()));
		tracer.trace(result);
		return result;
	}

	@Override
	public Result multiply(Operands operands) {
		Result result = new Result(BasicOperations.multiply(operands.getFirstOperand(), operands.getSecondOperand()));
		tracer.trace(result);
		return result;
	}

	@Override
	public Result divide(Operands operands) {
		Result result = new Result(BasicOperations.divide(operands.getFirstOperand(), operands.getSecondOperand()));
		tracer.trace(result);
		return result;
	}

}
