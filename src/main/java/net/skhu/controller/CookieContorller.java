package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mysql.service.EventService;
import net.skhu.redis.service.EventCookieService;


@Controller
@RequestMapping("cookie")
public class CookieContorller {
	@Autowired EventService eventService;
	@Autowired EventCookieService eventCookieService;
	@RequestMapping("guest/index")
	public String guestMain(Model model) {
		return "index/index";
	}

	@RequestMapping("guest/eventInfo")
	public String guestRequest(Model model) {
		model.addAttribute("events", eventService.findAll());
		return "request/eventInfo";
	}

	@RequestMapping("guest/sign")
	public String guestSign(Model model) {
		model.addAttribute("signInfo", model);
		return "sign/sign";
	}

	@RequestMapping("guest/login")
	public String guestLogin(Model model) {
		return "login/login";
	}

	@RequestMapping("admin/eventPlus")
	public String adminEventPlus(Model model) {
		model.addAttribute("events", eventService.findAll());
		return "request/eventPlus";
	}

	@RequestMapping("user/eventCandidate")
	public String userEventCandidate(Model model) {
		model.addAttribute("events", eventService.findAll());
		return "request/eventCandidate";
	}

	@RequestMapping("common/index")
	public String userIndex(Model model) {
		return "index/userIndex";
	}
}
