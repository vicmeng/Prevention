package cn.edu.bcu.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@MapperScan(value = "cn.edu.bcu.ls.mapper")
@ComponentScan(basePackages = { "cn.edu.bcu.ls" })
@SpringBootApplication
public class PreventionApplication{

	public static void main(String[] args) {
		SpringApplication.run(PreventionApplication.class, args);
	}

}
