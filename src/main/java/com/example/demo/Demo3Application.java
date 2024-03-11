package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Demo3Application.class, args);
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("localDate: "+ localDate);
		System.out.println("localTime: "+ localTime);
		System.out.println("localDateTime: "+ localDateTime);
		System.out.println("zoneDateTime: "+ zoneDateTime);
// giảm đi 1 ngày trong localDate
		localDate = localDate.minusDays(1);
		System.out.println("localDate after minus: "+ localDate);
// công thêm 2 ngày vào localDate
		localDate = localDate.plusDays(2);
		System.out.println("localDate after plus: "+ localDate);
// tạo đối tượng LocalDate từ ngày chỉ rõ
		LocalDate spec = LocalDate.of(2017, 11, 25);
		System.out.println("spec: " + spec);
		long days = ChronoUnit.DAYS.between(localDate, spec);
		System.out.println("duration between localDate and spec is: " + days + "days");
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee =new Employee();
//		employee.setFirstName("chunfg");
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
