package net.skhu.redis.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("cookie")
public class EventCookie {
	@Id
	String id; // Cookie ID

	@Indexed
	String userId; // 사용자의 영문ID

	@Enumerated(EnumType.STRING)
	EventType type; // 쿠키 처리 방식. 이는 Enumeration을 통해 설정한다.

	String cookieContext; // 이벤트 정보(이벤트 이름, 참여 시각)
}
