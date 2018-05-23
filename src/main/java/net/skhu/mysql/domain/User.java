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
	long id;

	@Column(name="userId", unique=true)
	String loginId;

	String password;
	String name;

	@Enumerated(EnumType.STRING)
	UserRole role;

	String address;
}
