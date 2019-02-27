package com.dri;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JobApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(JobApplication.class, args);
	}
}
