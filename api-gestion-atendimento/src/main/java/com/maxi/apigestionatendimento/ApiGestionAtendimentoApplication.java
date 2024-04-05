package com.maxi.apigestionatendimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxi.apigestionatendimento.repositories.TechnicRepository;

@SpringBootApplication
public class ApiGestionAtendimentoApplication {

	@Autowired 
	TechnicRepository technicRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiGestionAtendimentoApplication.class, args);
	}

}
