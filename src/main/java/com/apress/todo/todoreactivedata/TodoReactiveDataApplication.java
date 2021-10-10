package com.apress.todo.todoreactivedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
@EnableReactiveMongoRepositories(basePackages = {"com.apress.todo.repository"})
public class TodoReactiveDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoReactiveDataApplication.class, args);
	}

}
