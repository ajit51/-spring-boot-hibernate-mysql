package com.example.springboothibernatemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringBootHibernateMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateMysqlApplication.class, args);
	}

}
