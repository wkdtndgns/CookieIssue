package net.skhu.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.skhu.redis.domain.EventCookie;

@Repository
public interface EventCookieRepository extends CrudRepository<EventCookie, String>{

}
