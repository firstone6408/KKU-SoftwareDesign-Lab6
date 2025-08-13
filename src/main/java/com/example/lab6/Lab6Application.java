// * Main Application Class

package com.example.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
 * เนื่องจากว่าได้ทำการสร้าง Package Controllers, Services, Models
 * ไว้ Package อื่น จึงใช้ ComponentScan เพื่อตรวจหา
 */
@ComponentScan(basePackages = { "com.example.controllers", "com.example.services", "com.example.models" })
public class Lab6Application {

	public static void main(String[] args) {
		// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4
		// * Lab6 : Field, Constructor, and Setter Injection in Spring Boot
		SpringApplication.run(Lab6Application.class, args);
	}

}
