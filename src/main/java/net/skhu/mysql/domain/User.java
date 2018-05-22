package net.skhu.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id; // 사용자 ID

	@Column(name="userId", unique=true)
	String loginId; // 사용자 영문 ID

	String password; // 사용자 비밀번호
	String name; // 사용자 이름

	@Enumerated(EnumType.STRING)
	UserRole role; // 사용자 권한. 이는 Enumeration을 통해 설정한다.

	String address; // 사용자 주소
}
