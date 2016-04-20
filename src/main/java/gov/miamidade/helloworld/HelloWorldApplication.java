package gov.miamidade.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {


		System.out.println("HELLO WORLD");
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("BYE WORLD");

	}
}
