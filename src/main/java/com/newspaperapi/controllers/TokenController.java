package com.newspaperapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newspaperapi.models.Token;
import com.newspaperapi.services.TokenService;

@RestController
@RequestMapping("/api/token")
public class TokenController {

	@Autowired
	private TokenService tokenService;

	@PostMapping
	public void createToken(@RequestBody Token token) {
		tokenService.createToken(token);
	}
}
