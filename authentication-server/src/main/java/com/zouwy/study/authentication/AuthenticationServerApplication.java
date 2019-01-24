package com.zouwy.study.authentication;

import com.centit.framework.components.CodeRepositoryCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.centit","com.zouwy"})
@RestController
public class AuthenticationServerApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(AuthenticationServerApplication.class, args);
		CodeRepositoryCache.setApplicationContext(app);
	}

	@GetMapping(value = "/user")
	public Principal uer(Principal principal){
		return principal;
	}

}

