package com.cloud.api.microapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableJpaRepositories("com.cloud.api.microapirest")
@SpringBootApplication
public class MicroApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroApiRestApplication.class, args);
	}

}
