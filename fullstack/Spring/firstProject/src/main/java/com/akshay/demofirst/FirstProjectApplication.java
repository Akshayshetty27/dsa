package com.akshay.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext con= SpringApplication.run(FirstProjectApplication.class, args);
		
		Alien obj=con.getBean(Alien.class  );
		obj.code();
	}

}
