package com.newspaperapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newspaperapi.models.Token;

public interface TokenRepository extends JpaRepository<Token, Long>  {

}
