package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controller.GreetingController;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(SpringmvcApplication.class, args);
        GreetingController controller=(GreetingController)ctx.getBean("greetingController");
        controller.sayHello();
    }
}
