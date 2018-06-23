package net.skhu.domain;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.Data;

/**
 * Created by ds on 2018-04-09.
 */

@Data
@RedisHash("count") //레디스 테이블 키 값
public class Count implements Serializable {

    private static final long serialVersionUID = -287881979735272273L;

    //객체의 키 값
    @Id
    String id;

    @Indexed
    int count;



    public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	@Override
    public String toString() {
    	String s =String.valueOf(this.count);;
    	return s;
    }
}

