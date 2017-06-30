package com.adeytech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XlsheetgeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(XlsheetgeneratorApplication.class, args);

		new Generator().generate();
	}
}
