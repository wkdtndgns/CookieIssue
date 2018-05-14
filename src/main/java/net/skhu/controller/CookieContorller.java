package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("cookie")
public class CookieContorller {

	  @RequestMapping("index")
	    public String Main(Model model) {

	        return "index/index";
	    }

	    @RequestMapping("request")
	    public String Request(Model model) {

	        return "request/request";
	    }

	    @RequestMapping("sign")
	    public String Sign(Model model) {

	        return "sign/sign";
	    }

	    @RequestMapping("login")
	    public String login(Model model) {

	        return "login/login";
	    }
}
