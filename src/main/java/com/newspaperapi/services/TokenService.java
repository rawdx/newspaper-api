package com.newspaperapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newspaperapi.models.Token;
import com.newspaperapi.repositories.TokenRepository;

@Service
public class TokenService {

	@Autowired
	TokenRepository tokenRepository;
	
	public void createToken(Token token) {
		tokenRepository.save(token);
	}

}
