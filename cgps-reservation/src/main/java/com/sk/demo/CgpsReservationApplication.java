package com.sk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class CgpsReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgpsReservationApplication.class, args);
	}
	

}
