package cn.edu.bcu.ls;

import java.util.TimeZone;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@MapperScan(value = "cn.edu.bcu.ls.mapper")
@ComponentScan(basePackages = { "cn.edu.bcu.ls" })
@SpringBootApplication
public class PreventionApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		
		SpringApplication.run(PreventionApplication.class, args);
	}

}
