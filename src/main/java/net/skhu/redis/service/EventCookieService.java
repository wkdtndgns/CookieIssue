package net.skhu.redis.service;

import net.skhu.mysql.domain.Event;

public interface EventCookieService {
	void userCandidate(String userId, Event event);
}
