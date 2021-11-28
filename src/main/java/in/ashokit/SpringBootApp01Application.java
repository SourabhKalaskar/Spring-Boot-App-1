package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp01Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootApp01Application.class, args);
	
	context.close();
	
	}

}
