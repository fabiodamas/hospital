package io.github.fabiodamas.hospitalar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ola {
	
	@RequestMapping("/")
	String home() {
		return "Servidor no ar!!!  <p> http://localhost:8080/swagger-ui.html#/ </p>";
	}
}
