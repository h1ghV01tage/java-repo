package com.thehecklers.sburrestdemo;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
class RestApiDemoController {
	
	private List<Coffee> coffees = new ArrayList<>();
	
	public RestApiDemoController() {
		coffees.addAll(List.of(
				
				new Coffee("Cafe Cereza"),
				new Coffee("Cafe Ganador"),
				new Coffee("Cafe Lareno"),
				new Coffee("Cafe Tres Pontas")
				
				));
	}
	
	@GetMapping("/coffees")
	Iterable<Coffee> getCoffees(){
		return coffees;
	}
	
	@GetMapping("/coffees/{id}")
		Optional<Coffee> getCoffeeById(@PathVariable String id){
			for (Coffee c: coffees) {
				if(c.getId().equals(id)) {
				return Optional.of(c);
			}
		}
	
	return Optional.empty();
}
}
