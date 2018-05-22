package net.skhu.mysql.domain;

public enum UserRole {
	ADMIN("ADMIN"), USER("USER"); // 사용자 권한은 ADMIN, USER 둘 중 하나를 기입한다.
	String userType;
	UserRole(String userType){
		this.userType=userType;
	}
	public String getType() {
		return this.userType;
	}
}
