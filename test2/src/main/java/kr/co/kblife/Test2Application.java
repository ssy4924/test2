package kr.co.kblife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Test2Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { 
		return builder.sources(Test2Application.class); 
		
}
	

	
	

}
