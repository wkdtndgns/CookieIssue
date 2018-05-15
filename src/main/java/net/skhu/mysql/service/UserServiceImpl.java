package net.skhu.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.repository.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired UserRepository userReposiroty;
}
