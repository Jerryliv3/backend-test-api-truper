package com.truper.api.exam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.api.exam.model.LoginResponse;
import com.truper.api.exam.model.Response;
import com.truper.api.exam.service.ILoginService;

import lombok.extern.slf4j.Slf4j;

import static com.truper.api.exam.common.GlobalConstant.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(value = API_LOGIN)
public class LoginController {

	private ILoginService loginService;
	public LoginController (ILoginService loginService) {
		this.loginService = loginService;
	}
	
	@GetMapping(value = GET_TOKEN_LOGIN)
	public ResponseEntity<Object> getListCompra() {
		try {
			Optional<String> token = loginService.getToken();
			if (token.isPresent()) {
				return ResponseEntity.ok(
						LoginResponse.builder()
						.token(token.get())
						.type(TYPE)
						.build()
						);
			} else {
				return ResponseEntity.ok(
						Response.builder()
						.message(UNSUCCESS)
						.code(CODE_SUCCESS)
						.data("")
						.build()
						);
			}
		}catch (Exception e) {
			log.info("Error Controller getListcompra: {}", e );
			return ResponseEntity.internalServerError().build();
		}
	}
}
