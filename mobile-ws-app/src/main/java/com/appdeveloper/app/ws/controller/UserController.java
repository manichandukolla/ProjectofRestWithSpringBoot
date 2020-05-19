package com.appdeveloper.app.ws.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdeveloper.ws.request.model.UserRequestDetails;
import com.appdeveloper.ws.ui.response.model.UserRes;

@RestController
@RequestMapping("user")
public class UserController {
	@GetMapping
	public String getUser() {
		return "user is returning";
	}

	@PostMapping
	public UserRes User(@RequestBody UserRequestDetails userDetails) {
		return null;

	}

	@PutMapping
	public String updateUser() {
		return "updating user";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete the user";
	}

}
