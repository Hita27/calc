package com.mnemo.calculator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;

import io.corp.calculator.TracerImpl;

@Service
public class OperationsServiceImpl implements OperationsService {

	@Autowired
	private TracerImpl tracer;
	
	@Override
	public Result add(Operands operands) {
		//TODO
		return null;
	}

	@Override
	public Result subtract(Operands operands) {
		//TODO
		return null;
	}

}
