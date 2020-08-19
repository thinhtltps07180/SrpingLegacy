package tp.kits3.livedinner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tp.kits3.livedinner.service.RoleService;
import tp.kits3.livedinner.service.UserService;
import tp.kits3.livedinner.vo.Role;
import tp.kits3.livedinner.vo.User;

@Controller
public class LoginController {

	@Autowired
	RoleService roleService;

	@Autowired
	UserService userService;

	@Autowired
	HttpSession session;

	@GetMapping(value = { "/login" })
	public String getFormLogin(Model model) {
		return "login";
	}

	@PostMapping(value = { "/login" })
	public String login(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = userService.selectOne(username);
		if (user == null) {
			model.addAttribute("message", "Invalid username!");

		} else if (!password.equals(user.getPassword())) {
			model.addAttribute("message", "Invalid password!");
		} else {
			session.setAttribute("user", user);
			model.addAttribute("userInfor", user);
			Role checkRole = roleService.selectOne(user.getRoleId());
			
			if (checkRole.getName().equals("admin")) {
//				String url = (String) session.getAttribute("back-url");
//				if (url != null) {
//					return "redirect:" + url;
//				}
				return "redirect:/admin";
			} else {
				return "redirect:/";
			}

		}
		model.addAttribute("message", "Login successfully!");
		return "login";
	}
}
