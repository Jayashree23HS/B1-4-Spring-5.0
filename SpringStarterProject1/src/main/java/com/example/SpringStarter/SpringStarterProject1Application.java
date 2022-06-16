package com.example.SpringStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringStarter.entities.Student;

@SpringBootApplication
public class SpringStarterProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringStarterProject1Application.class, args);
		Student s=context.getBean(Student.class);
		//Student s=new Student();
		
		s.display();
	}

}


