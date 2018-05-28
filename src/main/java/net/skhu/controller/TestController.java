package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Count;
import net.skhu.domain.RedisCount;
import net.skhu.domain.RedisUser;
import net.skhu.service.CountService;
import net.skhu.service.UserService;

/**
 * Created by ds on 2018-04-09.
 */


@RestController
public class TestController {

    @Autowired
    UserService userService;

    @Autowired
    CountService countService;



    /**
     * 학번으로 조회
     * @param id
     * @return
     */
    @GetMapping("id/{id}")
    public RedisUser getUser(@PathVariable("id") final String id) {
        return userService.findById(id);
    }

    /**
     * 이름으로 조회
     * @param name
     * @return
     */
    @GetMapping("name/{name}")
    public List<RedisUser> getUserList(@PathVariable("name") final String name) {
        return userService.findByName(name);
    }

    /**
     * 사람 저장
     * @param user
     */
    @PostMapping("post")
    public void saveUser(final @RequestBody RedisUser user) {
    	System.out.println("되는중");
    	System.out.println(user.toString());

        userService.saveUser(user);
    }

    @PostMapping("count")
    public void saveCount(final @RequestBody Count count ) {

    	System.out.println("되는중");
    	count.setCount(RedisCount.getCount());
    	RedisCount.plusCount();

    	System.out.println(count.getCount());

        countService.saveCount(count);
    }

    /**
     * 학번으로 삭제
     * @param id
     */
    @DeleteMapping("delete/{id}")
    public void deleteUser(@PathVariable("id") final String id) {
        userService.deleteUser(id);
    }
}

