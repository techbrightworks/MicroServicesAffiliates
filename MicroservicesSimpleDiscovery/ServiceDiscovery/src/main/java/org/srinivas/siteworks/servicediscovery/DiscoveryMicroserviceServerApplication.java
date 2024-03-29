package org.srinivas.siteworks.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroserviceServerApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroserviceServerApplication.class, args);
	}
}