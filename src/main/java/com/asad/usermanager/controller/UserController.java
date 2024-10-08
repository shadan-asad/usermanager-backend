package com.asad.usermanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asad.usermanager.dto.ApiResponse;
import com.asad.usermanager.model.User;
import com.asad.usermanager.service.UserService;

// @CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("allUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping
	public ResponseEntity<ApiResponse> addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ApiResponse> editUser(@PathVariable int id, @RequestBody User user) {
		return userService.editUser(id, user);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
