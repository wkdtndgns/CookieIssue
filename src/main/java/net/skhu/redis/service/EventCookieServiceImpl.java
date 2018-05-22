package net.skhu.redis.service;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.domain.User;
import net.skhu.redis.repository.EventCookieRepository;

@Service
public class EventCookieServiceImpl implements EventCookieService{
	@Autowired EventCookieRepository cookieRepository;
	@Override
	public void insertCookie(User user) {
		Cookie cookie = new Cookie(user.getLoginId(), "");
		cookie.setMaxAge(60);
	}
}
