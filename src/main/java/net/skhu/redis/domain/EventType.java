package net.skhu.redis.domain;

public enum EventType {
	EVENT_CANDIDATE("EVENT_CANDIDATE"), EVENT_CANCELING("EVENT_CANCELING"), EVENT_EXCEPTION("EVENT_EXCEPTION");
	String eventType;
	EventType(String eventType){
		this.eventType=eventType;
	}
	public String getEventType() {
		return this.eventType;
	}
}
