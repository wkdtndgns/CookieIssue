package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.mysql.domain.User;
import net.skhu.mysql.service.UserService;

// 이 REST API는 MySQL 서버에서 데이터를 받아서 실제로 작동하는 여부를 확인하기 위한 테스팅 용도로 쓰입니다.
@RestController
@CrossOrigin
@RequestMapping("testing")
public class TestingRestController {
	@Autowired UserService userService;
	@PostMapping("user_inserting")
	public ResponseEntity<String> userInserting(){
		userService.inserting_user_ten_thousands();
		return new ResponseEntity<String>("User Inserting Is Successed.", HttpStatus.CREATED);
	}
	@GetMapping("findAll")
	public ResponseEntity<List<User>> findAll(){
		List<User> users = userService.findAll();
		if(users.size() > 0) return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		else return new ResponseEntity<List<User>>(users, HttpStatus.NO_CONTENT);
	}
	@DeleteMapping("deleteAll")
	public ResponseEntity<String> deleteAll(){
		userService.deleteAll();
		return new ResponseEntity<String>("User Deleting Is Successed.", HttpStatus.OK);
	}
}
