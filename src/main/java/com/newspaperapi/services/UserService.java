package com.newspaperapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newspaperapi.models.User;
import com.newspaperapi.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user, Long id) {
		User obtainedUser = userRepository.findById(id).get();

//		obtainedUser.setDniUsuario(user.getDniUsuario());
//		obtainedUser.setNombreUsuario(user.getNombreUsuario());
//		obtainedUser.setApellidosUsuario(user.getApellidosUsuario());
//		obtainedUser.setTlfUsuario(user.getTlfUsuario());
//		obtainedUser.setEmailUsuario(user.getEmailUsuario());
//		obtainedUser.setClaveUsuario(user.getU());
		userRepository.save(obtainedUser);
	}

	public Boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	public boolean emailExists(String email) {
		return userRepository.existsByEmail(email);
	}
}