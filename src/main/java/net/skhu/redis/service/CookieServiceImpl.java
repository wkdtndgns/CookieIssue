package net.skhu.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.redis.repository.CookieRepository;

@Service
public class CookieServiceImpl {
	@Autowired CookieRepository cookieRepository;
}
