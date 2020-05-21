package com.company.people.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.people.memberdto.PeopleMemberDTO;
import com.company.people.memberservice.PeopleMemberService;

@Controller
public class PeopleMemberController {

	@Inject
	PeopleMemberService service;

	// 로그인 get
	@RequestMapping(value = "/{sitename}/login", method = RequestMethod.GET)
	public String getLogin(@PathVariable("sitename") String sitename, Model model) {
		model.addAttribute("sitename", sitename);

		return "/people/member/login";
	}

	// 로그인 post
	@RequestMapping(value = "/{sitename}/login", method = RequestMethod.POST)
	public String postLogin(@PathVariable("sitename") String sitename, PeopleMemberDTO dto, HttpServletRequest req,
			RedirectAttributes rttr) throws Exception {
		HttpSession session = req.getSession();

		PeopleMemberDTO login = service.login(sitename, dto);
		
		if (login == null) {
			session.setAttribute("peoplemember", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/{sitename}/login";
		} else {
			session.setAttribute("peoplemember", login);
		}

		return "redirect:/people/{sitename}";
	}

	// 로그아웃 get
	@RequestMapping(value = "/{sitename}/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();

		return "redirect:/people/{sitename}";
	}

	// 회원가입 get
	@RequestMapping(value = "/{sitename}/register", method = RequestMethod.GET)
	public String getRegister(@PathVariable("sitename") String sitename, Model model) throws Exception {
		model.addAttribute("sitename", sitename);

		return "people/member/register";
	}

	// 회원가입 post
	@RequestMapping(value = "/{sitename}/register", method = RequestMethod.POST)
	public String postRegister(@PathVariable("sitename") String sitename, PeopleMemberDTO dto) throws Exception {

		service.register(sitename, dto);
		return "redirect:/{sitename}/login";
	}
}
