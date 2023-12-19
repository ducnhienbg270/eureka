package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaServer
public class OrderApplication {


	public static void main(String[] args) {
		String ip = InetAddress.getLoopbackAddress().getHostAddress();
		System.out.println("ip: " + ip);
		SpringApplication.run(OrderApplication.class, args);
	}

}
