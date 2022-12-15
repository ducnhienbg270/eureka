package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {


	public static void main(String[] args) {
		String ip = InetAddress.getLoopbackAddress().getHostAddress();
		System.out.println("ip: " + ip);
		SpringApplication.run(EurekaApplication.class, args);
	}

}
