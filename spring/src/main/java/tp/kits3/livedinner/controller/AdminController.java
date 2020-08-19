package tp.kits3.livedinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tp.kits3.livedinner.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	UserService service;
	
	@GetMapping(value = "/admin")
	public String home( Model model) {

		return "admin/index";
	}
}
