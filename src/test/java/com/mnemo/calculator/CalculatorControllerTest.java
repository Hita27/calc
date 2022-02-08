package com.mnemo.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mnemo.calculator.controller.CalculatorController;
import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;

@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest {
	
	@Mock
    private OperationsService operationsService;
	
	@InjectMocks
    private CalculatorController controller;
	
	private Result result;
	private Operands operands;

    @BeforeEach
    void setMockOutput() {
    	result = new Result(5);
    	operands = new Operands();
    }

    @Test
    public void addTest() {
    	when(operationsService.add(isA(Operands.class))).thenReturn(result);
    	
        Result result = controller.add(operands);
        assertThat(result).isEqualTo(this.result);
    }
    
    @Test
    public void subtractTest() {
    	when(operationsService.subtract(isA(Operands.class))).thenReturn(result);
    	
        Result result2 = controller.subtract(operands);
        assertThat(result2).isEqualTo(this.result);
    }
}
