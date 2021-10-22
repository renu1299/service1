package com.service1.service1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service1")

public class Service1Controller {
	public String test1() {
		return "Get method calling";
				
	}
	
 //@GetMapping("/post")
 public String test2() {
	 return"controller post ";

}
}