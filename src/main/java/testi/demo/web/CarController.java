package testi.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@RequestMapping("/main")
	@ResponseBody
	public String showMainPage() {
		return "moi";
	}

	@RequestMapping("moi")
	@ResponseBody
	public String sayHelloToSomebody(@RequestParam(name = "nimesi") String nimi) {
		return "Hei " + nimi;
	}

	@RequestMapping("moi2")
	@ResponseBody
	public String sayHelloToSomebody2(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi) {
		return "Hei " + nimi;
	}

	@RequestMapping("moi3")
	@ResponseBody
	public String sayHelloToSomebody3(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi,
	@RequestParam (name="ika") int age) {
		return "Hei " + nimi + ", " + age + " vuotta.";
	}
}
