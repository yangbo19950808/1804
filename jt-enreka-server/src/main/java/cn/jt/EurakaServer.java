package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动Eureka
@EnableEurekaServer
@SpringBootApplication
public class EurakaServer {

	public static void main(String[] args) {
		
		SpringApplication.run(EurakaServer.class, args);
	}

}
