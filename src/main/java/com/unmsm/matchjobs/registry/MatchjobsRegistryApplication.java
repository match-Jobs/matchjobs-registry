package com.unmsm.matchjobs.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MatchjobsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchjobsRegistryApplication.class, args);
	}

}
