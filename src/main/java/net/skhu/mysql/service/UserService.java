package net.skhu.mysql.service;

import java.util.List;

import net.skhu.mysql.domain.User;
public interface UserService {
	void inserting_user_ten_thousands();
	List<User> findAll();
	void deleteAll();
	User userLogin(String loginId, String password);
}
