package com.example.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
