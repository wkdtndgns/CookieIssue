package net.skhu.mysql.domain;

public enum UserRole {
	ADMIN("ADMIN"), USER("USER");
	String userType;
	UserRole(String userType){
		this.userType=userType;
	}
	public String getType() {
		return this.userType;
	}
}
