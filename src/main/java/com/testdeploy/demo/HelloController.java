package com.testdeploy.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
	@GetMapping()
	public ResponseEntity helloWorld(){
		return ResponseEntity.from("hello-world!17");
	}
}
