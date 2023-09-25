package com.testdeploy.demo;

import lombok.Getter;

@Getter
public class ResponseEntity {
	private String result;

	private ResponseEntity(String result) {
		this.result = result;
	}

	public static ResponseEntity from(String result) {
		return new ResponseEntity(result);
	}
}
