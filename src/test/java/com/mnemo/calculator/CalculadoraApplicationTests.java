package com.mnemo.calculator;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.JSONObject;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CalculadoraApplicationTests {

	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    
    private ObjectMapper objectMapper = new ObjectMapper();
    private HttpHeaders headers;
    private JSONObject data;
    private HttpEntity<String> request;
    
    @BeforeEach
    void prepareTest() {
    	headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
		
		data = new JSONObject();
		data.put("firstOperand", 1);
		data.put("secondOperand", 2);
		
		request = new HttpEntity<String>(data.toString(), headers);
    }
    
	@Test
	void contextLoads() throws IOException {
		String response = restTemplate.postForObject(
			new URL("http://localhost:" + port + "/api/add").toString(), request, String.class);
		JsonNode root = objectMapper.readTree(response);
		assertNotNull(root);
	}

}
