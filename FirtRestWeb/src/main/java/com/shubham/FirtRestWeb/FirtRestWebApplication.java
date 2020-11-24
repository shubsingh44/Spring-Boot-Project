package com.shubham.FirtRestWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan("com.shubham")
@EntityScan( basePackages = {"com.shubham.*"})
@EnableJpaRepositories(basePackages = {"com.shubham"})/*when entity and jpa repositories are in 
                                                         different package add it*/
public class FirtRestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirtRestWebApplication.class, args);
	}
}
