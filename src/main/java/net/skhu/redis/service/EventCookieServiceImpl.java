package net.skhu.redis.service;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.domain.Event;
import net.skhu.redis.repository.EventCookieRepository;

@Service
public class EventCookieServiceImpl implements EventCookieService{
	@Autowired EventCookieRepository eventCookieRepository;
	@Override
	public void userCandidate(String userId, Event event) {
		Cookie cookie = new Cookie("userName", userId);
		cookie.setMaxAge(60);
	}
}
