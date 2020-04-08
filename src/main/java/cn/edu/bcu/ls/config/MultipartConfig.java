package cn.edu.bcu.ls.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@Configuration
public class MultipartConfig {
	 @Bean
	    public MultipartConfigElement multipartConfigElement() {
	        MultipartConfigFactory config = new MultipartConfigFactory();
	        config.setMaxFileSize( DataSize.ofBytes(1048576*10));
	        config.setMaxRequestSize( DataSize.ofBytes(1048576*100));
	       
	        return config.createMultipartConfig();
	    }
}
