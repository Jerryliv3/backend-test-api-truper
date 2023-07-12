package com.truper.api.exam.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

	private String message;
	private int code;
	private Object data;
}
