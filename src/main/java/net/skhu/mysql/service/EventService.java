package net.skhu.mysql.service;

import java.util.List;

import net.skhu.mysql.domain.Event;

public interface EventService {
	List<Event> findAll();
}
