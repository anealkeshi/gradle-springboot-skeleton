package me.anilkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BarServiceApplication {

	@Bean
	public FooService fooService() {
		return new FooServiceImpl();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BarServiceApplication.class, args);
	}
}
