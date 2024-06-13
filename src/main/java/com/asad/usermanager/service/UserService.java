package com.asad.usermanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.asad.usermanager.dao.UserDao;
import com.asad.usermanager.dto.ApiResponse;
import com.asad.usermanager.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public ResponseEntity<List<User>> getAllUsers() {
		try {
			List<User> users = userDao.findAll();
			users.sort((a,b) -> a.getId() - b.getId());
			return new ResponseEntity(users, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(new ArrayList<User>(), HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<ApiResponse> addUser(User user) {
		ApiResponse res;
		try {
			userDao.save(user);
			res = new ApiResponse("User added successfully!");
			return new ResponseEntity<ApiResponse>(res, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			res = new ApiResponse("Unable to add user!");
			return new ResponseEntity(res, HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity getUserById(int id) {
		try {
			User user = userDao.findById(id).orElseThrow(() -> new RuntimeException());
			return new ResponseEntity(user, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			ApiResponse res = new ApiResponse("User not found!");
			return new ResponseEntity(res, HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity deleteUser(int id) {
		ApiResponse res;
		try {
			userDao.deleteById(id);
			res = new ApiResponse("User deleted successfully!");
			return new ResponseEntity(res, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			res = new ApiResponse("User not found!");
			return new ResponseEntity(res, HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity editUser(int id, User user) {
		ApiResponse res;
		try {
			User nuser = userDao.findById(id).orElseThrow(() -> new RuntimeException());
			user.setId(nuser.getId());
			userDao.save(user);
			res = new ApiResponse("User updated successfully!");
			return new ResponseEntity(res, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			res = new ApiResponse("User not found!");
			return new ResponseEntity(res, HttpStatus.BAD_REQUEST);
		}
	}

}
