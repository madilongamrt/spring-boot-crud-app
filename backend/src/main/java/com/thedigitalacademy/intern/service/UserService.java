package com.thedigitalacademy.intern.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thedigitalacademy.intern.entity.User;
import com.thedigitalacademy.intern.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;// why are we communication using service and repository

//what is this for Collection<?
	public Collection<? extends User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	public Collection<? extends User> getUserById(String userId) {
		List<User> userList = new ArrayList<>();
		userList.add(userRepository.findById(userId).get());
		return userList;
	}

	public Collection<? extends User> getAllUserById(String ids) {
		List<User> userList = new ArrayList<>();
		List<String> idList = Arrays.asList(ids.split(","));
		// userList.addAll(userRepository.findAllById(idList);
		userRepository.findAllById(idList).forEach(userList::add);
		return userList;
	}

	public String saveUser(User user) {
		User savedUser = userRepository.save(user);
		if (savedUser != null) {
			return "Saved :  userId - " + savedUser.getId();
		} else {
			return "Failed :  userId - " + user.getId();
		}
	}

	public String saveUserList(List<User> userList) {
		List<User> savedUserList = new ArrayList<>();
		userRepository.saveAll(userList).forEach(savedUserList::add);
		return "saved : user ids -" + savedUserList.stream().map(u -> u.getId()).collect(Collectors.toList());
	}

	public String deleteUser(User user) {
		userRepository.delete(user);
		return "Deleted succesfully";
	}

	public String deleteUserById(String userId) {
		try {
			userRepository.deleteById(userId);

			return "User with userId- " + userId + " not exists...!!";
		} catch (Exception e) {
			return "Deleted succesfully";
		}
	} 

	public String deleteAllUserList(List<User> userList) {
		userRepository.deleteAll(userList);
		return "Deleted succesfully";
	}

}
