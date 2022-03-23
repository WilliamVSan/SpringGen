package com.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!!";
		
	}
	
	@GetMapping("/bsm")
	public String bsmlist() {
		
		return "BSM List:\nMentalidades: Orientação ao Futuro | Responsabilidade Pessoal | Mentalidade de Crescimento" +
				         "\nHabilidades: Trabalho em Equipe | Atenção aos Detalhes | Proatividade";
		
	}
	
	@GetMapping("/objlist")
	public String objetivoslist() {
		
		return "Objetivos de Aprendizagem:\nMelhorar a Atenção aos Detalhes, e habilidades técnicas: Java, Spring";
		
	}
	
}
