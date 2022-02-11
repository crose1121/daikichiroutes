package com.rose.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/today")
	public String today() {
		return "Opportunities will present themselves to you today!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow is never guaranteed, so be your best every day!";
	}
	
	@RequestMapping("/travel/{destination}")
	public String travel(@PathVariable("destination") String destination) {
		return String.format("You are traveling to: %s", destination);
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if (number%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";}
	}
}
