package com.testdeploy.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
	@GetMapping()
	public ResponseWrapper helloWorld(){
		return ResponseWrapper.from("hello-world!21");
	}
}
