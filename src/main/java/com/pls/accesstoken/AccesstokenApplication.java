package com.pls.accesstoken;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@MapperScan(basePackages = "com.pls.accesstoken.dao")
public class AccesstokenApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(AccesstokenApplication.class, args);
	}
}
