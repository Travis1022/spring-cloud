package com.txw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"com.txw.controller"})
@EntityScan("com.txw.entity")
@EnableJpaRepositories("com.txw.dao")
public class SimpleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProviderUserApplication.class, args);
	}
}
