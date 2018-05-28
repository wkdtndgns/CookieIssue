package net.skhu.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.mysql.domain.Event;
import net.skhu.mysql.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	@Autowired EventRepository eventRepository;
	@Override
	public List<Event> findAll(){
		return eventRepository.findAll();
	}
}
