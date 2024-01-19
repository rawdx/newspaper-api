package com.newspaperapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.newspaperapi.dtos.UserDto;
import com.newspaperapi.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT new com.newspaperapi.dtos.UserDto(u.email, u.credential) FROM User u WHERE u.email = :email")
	Optional<UserDto> findEmailAndCredentialByEmail(String email);
    
    boolean existsByEmail(String email);
    
}
