package net.skhu.redis.domain;

public enum EventType {
	// 이벤트 쿠키의 형식을 각각 참여함, 취소함, 예외 발생 으로 설정한다.
	EVENT_CANDIDATED("EVENT_CANDIDATED"), EVENT_CANCELED("EVENT_CANCELED"), EVENT_EXCEPTION("EVENT_EXCEPTION");
	String eventType;
	EventType(String eventType){
		this.eventType=eventType;
	}
	public String getEventType() {
		return this.eventType;
	}
}
