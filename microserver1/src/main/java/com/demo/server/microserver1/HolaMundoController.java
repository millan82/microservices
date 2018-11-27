package com.demo.server.microserver1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

	@Value("${message: hello default}")
	private String message;
	
	@Value("${name: fer default}")
	private String name;
	
	@RequestMapping("/")
	public String saludate() {
		return message + " " + name;
	}
}
