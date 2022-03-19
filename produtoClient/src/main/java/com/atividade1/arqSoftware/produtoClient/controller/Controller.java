package com.atividade1.arqSoftware.produtoClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class Controller {
	
	@GetMapping
	public String getProduto() {
		return "produtos";
	}

}
