package com.truper.api.exam.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

	private String token;
	private String type;
}
