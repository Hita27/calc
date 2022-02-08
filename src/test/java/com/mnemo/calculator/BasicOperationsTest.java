package com.mnemo.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mnemo.calculator.utils.BasicOperations;

@ExtendWith(MockitoExtension.class)
public class BasicOperationsTest {
	
	@Test
    public void addTest() {
    	BasicOperations.add(2d, 3d);
    }
	
	@Test
    public void subtractTest() {
		BasicOperations.add(3d, 2d);
    }
	
	@Test
    public void multiplyTest() {
		BasicOperations.add(2d, 3d);
    }
	
	@Test
    public void divideTest() {
		BasicOperations.add(6d, 3d);
    }
}
