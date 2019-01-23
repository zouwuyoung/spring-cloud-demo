package com.zouwy.study.authentication;

import com.centit.framework.model.adapter.PlatformEnvironment;
import com.centit.framework.security.model.CentitPasswordEncoder;
import com.centit.framework.security.model.StandardPasswordEncoderImpl;
import com.centit.framework.system.security.DaoUserDetailsService;
import com.centit.framework.system.service.impl.DBPlatformEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class EnvironmentConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        return new DaoUserDetailsService();
    }

    @Bean
    public PlatformEnvironment platformEnvironment(){
        return new DBPlatformEnvironment();
    }

    @Bean
    public CentitPasswordEncoder passwordEncoder(){
        return new StandardPasswordEncoderImpl();
    }
}
