package com.thedigitalacademy.intern.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thedigitalacademy.intern.entity.User;
import com.thedigitalacademy.intern.service.UserService;

@RestController // why you
@RequestMapping(path = "/user") // what you what help
public class UserController {

	@Autowired
	UserService userService; // what is the to create object of service in our controller

	/**
	 * This method return all available user
	 * 
	 * @return userList
	 */

	@GetMapping(path = "/getusernames")
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList.addAll(userService.getAllUsers());
		return userList;
	}

	/**
	 * this return user with the provided userId
	 * 
	 * @param userId
	 * @return
	 */
	
	@GetMapping(path = "/getUserById /{userId} ")
	public List<User> getUserById(@PathVariable(name = "userId") String userId) {
		List<User> userList = new ArrayList<>();
		userList.addAll(userService.getUserById(userId));
		return userList;
	}

	@GetMapping(path = "/getAllUserById /{userId} ")
	public List<User> getAllUserById(@PathVariable(name = "userId") String ids) {
		List<User> userList = new ArrayList<>();
		userList.addAll(userService.getAllUserById(ids));
		return userList;
	}

	@PostMapping(path = "/saveUser")
	public String saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PostMapping(path = "/saveUserList")
	public String saveUserList(@RequestBody List<User> userList) {
		return userService.saveUserList(userList);
	}

	@DeleteMapping(path = "deleteUser")
	public String deleteUser(@RequestBody User user) {

		return userService.deleteUser(user);
	}

	@DeleteMapping(path = "/deleteUserById/{userId}")
	public String DeleteUserById(@PathVariable(name = "userId") String UserId) {
		return userService.deleteUserById(UserId);
	}

	@DeleteMapping(path = "/deleteAllUserById/{userId}")
	public String DeleteAllUserList(@RequestBody List<User> userList ) {
		return userService.deleteAllUserList(userList);
	}

}
