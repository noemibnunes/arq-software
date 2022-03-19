package com.atividade1.arqSoftware.produtoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProdutoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoClientApplication.class, args);
	}

}
