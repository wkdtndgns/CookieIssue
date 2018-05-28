package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mysql.repository.EventRepository;


@Controller
@RequestMapping("cookie")
public class CookieContorller {
	@Autowired EventRepository eventRepository;
	@RequestMapping("guest/index")
	public String guestMain(Model model) {
		return "index/index";
	}

	@RequestMapping("guest/eventInfo")
	public String guestRequest(Model model) {
		model.addAttribute("events", eventRepository.findAll());
		return "request/eventInfo";
	}

	@RequestMapping("guest/sign")
	public String guestSign(Model model) {
		return "sign/sign";
	}

	@RequestMapping("guest/login")
	public String guestLogin(Model model) {
		return "login/login";
	}

	@RequestMapping("common/index")
	public String userIndex(Model model) {
		return "index/userIndex";
	}
}
