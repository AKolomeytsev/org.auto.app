package org.auto.org.auto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import jakarta.servlet.http.HttpServletRequest;

@SpringBootApplication
@ComponentScan(basePackages = {"org.auto.org.auto"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
