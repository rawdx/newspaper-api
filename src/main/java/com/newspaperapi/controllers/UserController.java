package com.newspaperapi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newspaperapi.models.User;
import com.newspaperapi.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public Iterable<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

	@GetMapping(path = "/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id) {
		return this.userService.getUser(id);
	}

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody User user) {

		if (userService.emailExists(user.getEmail())) {
			return new ResponseEntity<>("Email already exists", HttpStatus.BAD_REQUEST);
		}

		userService.createUser(user);
		return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
	}

	@PutMapping(path = "{id}")
	public void updateUser(@RequestBody User user, @PathVariable("id") Long id) {
		this.userService.updateUser(user, id);
	}

	@DeleteMapping(path = "{id}")
	public Boolean deleteUser(@PathVariable("id") Long id) {
		return this.userService.deleteUser(id);
	}

}
