package com.example.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

/*
		The type of IoC container is ApplicationContext. ApplicationContext will work only when we create an object of it , but what if spring automatically gives us the object.
		This line SpringApplication.run(MyAppApplication.class, args) creates the container for us. The un method basically returns the object of
		ConfigurableApplicationContext, which inturn extends ApplicationContext. That means run method returns obj of Applicationcontext.
		Spring says which class's object u want? for that we can use @component.
*/

		ApplicationContext context= SpringApplication.run(MyAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}
