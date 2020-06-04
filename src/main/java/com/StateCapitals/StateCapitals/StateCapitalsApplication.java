package com.StateCapitals.StateCapitals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class StateCapitalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateCapitalsApplication.class, args);

		HashMap<String,String> StateCapitals = new HashMap<>();

		StateCapitals.put("Alabama","Montgomery");
		StateCapitals.put("Alaska", "Juneau");
		StateCapitals.put("Arizona" , "Phoenix");
		StateCapitals.put("Arkansas", "Little Rock");
		System.out.println(StateCapitals.size());

		Set<String> states = StateCapitals.keySet();
		for (String currentState : states){
			System.out.println(currentState);
		}
	}




}
