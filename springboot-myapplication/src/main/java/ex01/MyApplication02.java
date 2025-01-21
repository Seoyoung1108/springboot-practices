package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class MyApplication02 {

	@Bean("MyComponent02")
	public MyComponent myComponent() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication02.class, args)){}
	}


}
