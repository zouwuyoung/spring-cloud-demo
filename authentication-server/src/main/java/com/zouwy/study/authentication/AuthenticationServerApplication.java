package com.zouwy.study.authentication;

import com.centit.framework.components.CodeRepositoryCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
@ComponentScan(basePackages = {"com.centit","com.zouwy"})
public class AuthenticationServerApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(AuthenticationServerApplication.class, args);
		CodeRepositoryCache.setApplicationContext(app);
	}

}

