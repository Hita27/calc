package com.mnemo.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

	private double result;

	@Override
	public String toString() {
		return Double.toString(result);
	}
	
	
}
