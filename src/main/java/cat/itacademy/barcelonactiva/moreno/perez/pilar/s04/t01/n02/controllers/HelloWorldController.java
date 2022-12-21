package cat.itacademy.barcelonactiva.moreno.perez.pilar.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//  http://localhost:9001/HelloWorld
//  http://localhost:9001/HelloWorld?nom=El meu nom
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
		return "Hola " + nom + ". Estàs executant un projecte Gradle";
	}
	
//  http://localhost:9001/HelloWorld2
//  http://localhost:9001/HelloWorld2/el meu nom
	@GetMapping(value= {"/HelloWorld2","/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable (required= false) String nom) {
		String nomDefault = "UNKNOWN";
		if(nom!=null) {
			return "Hola " + nom + ". Estàs executant un projecte Gradle";
		}else {
			return "Hola "+ nomDefault + ". Estàs executant un projecte Gradle";
		}
	}
}
