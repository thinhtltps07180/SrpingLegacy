package tp.kits3.livedinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tp.kits3.livedinner.service.BookService;
import tp.kits3.livedinner.service.PostService;
import tp.kits3.livedinner.service.TagService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ClientController {

	@Autowired
	BookService service;

	@Autowired
	TagService tagService;

	@Autowired
	PostService postService;

	@GetMapping(value = { "/", "/index" })
	public String home(Model model) {

		return "index";
	}


}
