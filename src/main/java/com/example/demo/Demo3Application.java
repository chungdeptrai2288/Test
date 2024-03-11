package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Demo3Application.class, args);
		System.out.println("hello");
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee =new Employee();
//		employee.setFirstName("chung");
//		employee.setLastName("pham");
//		employee.setEmailId("chung@gmail.com");
//		employeeRepository.save(employee);
//		Employee employee1 =new Employee();
//		employee1.setFirstName("hoang");
//		employee1.setLastName("nguyen");
//		employee1.setEmailId("hoang@gmail.com");
//		employeeRepository.save(employee1);
	}



}
