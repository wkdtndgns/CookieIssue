package net.skhu.mysql.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id; // 이벤트 ID

	String name; // 이벤트 이름

	@Column(name="startDate", nullable = false)
	LocalDateTime start; // 이벤트 시작 기간

	@Column(name="endDate", nullable = false)
	LocalDateTime end; // 이벤트 종료 기간

	@Column(name="personalCount")
	int personal; // 개인이 중복해서 발급받을 수 있는 쿠키의 수

	@Column(name="totalCount")
	int total; // 한 이벤트 안에서 모든 사용자들이 발급받을 수 있는 쿠키의 수
}
