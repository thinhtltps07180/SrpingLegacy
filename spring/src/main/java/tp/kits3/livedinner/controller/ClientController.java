package tp.kits3.livedinner.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tp.kits3.livedinner.service.BookService;
import tp.kits3.livedinner.vo.Book;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ClientController {
	
	@Autowired
	BookService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

	@GetMapping(value = {"/"})
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		List<Book> list = service.findAll();
		
		logger.info(" {}.",list.get(0).getBkemail() );
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
}
