package testi.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class chapter1Controller {
	
	@RequestMapping("index")
	@ResponseBody
	public String showIndexPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String welcomeToThePlaceName(
			@RequestParam(name = "location", required = false, defaultValue = "Earth") String sijainti,
			@RequestParam(name = "name", required = false, defaultValue = "Matti") String nimi) {
		return "Welcome to the " + sijainti + ", " + nimi + "!";
	}
}