package net.skhu.redis.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("cookie")
public class Cookie {
	@Id
	String id;

	@Indexed
	String userId;

	@Enumerated(EnumType.STRING)
	EventType type;

	String jwt_cookie;
}
