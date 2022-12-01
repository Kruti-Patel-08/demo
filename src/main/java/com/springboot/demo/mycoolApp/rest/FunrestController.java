package com.springboot.demo.mycoolApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrestController {
	
	@GetMapping("/")
	public String SayHello() {
		
		return "Hello Time on SERVER IS " + LocalDateTime.now();
		
	}
	
	//expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() { 
	
		return "Run hard for 5km";
	}
	
	//expose a new endpoint for "fortune"
		@GetMapping("/fortune")
		public String getDailyFortune() { 
		
			return "TODAY is your Lucky day";
		}
}
