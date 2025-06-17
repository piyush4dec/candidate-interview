package com.walmart.sbpg;

import org.springframework.boot.SpringApplication;

public class TestSbpgApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootApp::main)
				/*.with(TestcontainersConfiguration.class)*/
				.run(args);
	}

}
