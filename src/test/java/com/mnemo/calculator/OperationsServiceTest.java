package com.mnemo.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mnemo.calculator.model.Operands;
import com.mnemo.calculator.model.Result;
import com.mnemo.calculator.service.OperationsService;
import com.mnemo.calculator.service.impl.OperationsServiceImpl;

import io.corp.calculator.TracerImpl;

@ExtendWith(MockitoExtension.class)
public class OperationsServiceTest {
	
	@Mock
    private TracerImpl tracer;
	
	@InjectMocks
    private OperationsService service = new OperationsServiceImpl();
	
	private Operands operands;
	
	@BeforeEach
    void setMockOutput() {
    	operands = new Operands(5,3);
    }

    @Test
    public void addTest() {    	
        Result result = service.add(operands);
        assertThat(result).isEqualTo(new Result(8));
    }
    
    @Test
    public void subtractTest() {
        Result result2 = service.subtract(operands);
        assertThat(result2).isEqualTo(new Result(2));
    }
}
