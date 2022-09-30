package com.example.demohaproxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoHaproxyApplication {


	@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String welcome(){
		return "port: " + port + " page: Welcome";
	}

	@RequestMapping("/app1")
	public String app1(){
		return "port: " + port + " page: app1";
	}

	@RequestMapping("/app2")
	public String app2(){
		return "port: " + port + " page: app2";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoHaproxyApplication.class, args);
	}
}
