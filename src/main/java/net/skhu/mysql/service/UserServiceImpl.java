package net.skhu.mysql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.domain.User;
import net.skhu.mysql.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserRepository userRepository;

	@Override
	@Transactional
	public void inserting_user_ten_thousands() {
		userRepository.inserting_user_ten_thousands();
	}

	@Override
	public List<User> findAll(){
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public void deleteAll() {
		userRepository.deleteAll();
	}
}
