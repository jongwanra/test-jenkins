package com.testdeploy.demo;

import lombok.Getter;

@Getter
public class ResponseWrapper<T> {
	private T result;

	private ResponseWrapper(T result) {
		this.result = result;
	}

	public static <T> ResponseWrapper from(T result) {
		return new ResponseWrapper(result);
	}
}
