package com.ks.provincia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvinciaApplication {


	private static final Logger logger=  LoggerFactory.getLogger(ProvinciaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProvinciaApplication.class, args);
		logger.info("Application started");
	}

}
