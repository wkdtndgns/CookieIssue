package net.skhu.mysql.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.domain.User;
import net.skhu.mysql.repository.UserRepository;
import net.skhu.util.Encryption;

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

	@Override
	public User userLogin(String loginId, String password) {
		Optional<User> user = userRepository.findByLoginId(loginId);
		if(user.isPresent()) {
			User currentUser = user.get();
			String pw = Encryption.encrypt(password, Encryption.MD5);
			if(!currentUser.getPassword().equals(pw)) return null;
			return currentUser;
		}else {
			return null;
		}
	}
}
