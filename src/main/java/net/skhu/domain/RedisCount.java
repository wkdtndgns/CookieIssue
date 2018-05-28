package net.skhu.domain;

public class RedisCount {

	static int count=1;


	public static int getCount() {
		return count;
	}

	public static void plusCount() {
		count++;
	}

}
