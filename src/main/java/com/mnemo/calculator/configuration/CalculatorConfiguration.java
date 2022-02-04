package com.mnemo.calculator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.corp.calculator.TracerImpl;

@Configuration
public class CalculatorConfiguration {

	@Bean
	public TracerImpl tracer() {
//		A la clase TracerImpl dada le falta el implements de la interface
//		Por este motivo prescindo de la interfaz
		return new TracerImpl();
	}
}
