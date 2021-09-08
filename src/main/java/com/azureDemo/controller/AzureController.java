package com.azureDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class AzureController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "azure deployeement successfully !........";
	}

}
