package com.didispace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableEurekaServer
@EnableScheduling
@MapperScan("com.didispace.web.jdbc.mapper")
@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class HelloApplication  {

    public static void main(String[] args)  {
        SpringApplication.run(HelloApplication.class, args);
    }

//    @Override//为了打包springboot项目
//    protected SpringApplicationBuilder configure(
//            SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }
}
