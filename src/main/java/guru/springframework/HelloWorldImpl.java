package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloworldService {
	public void sayHello(){
		System.out.println("hello world how are you");
	}
}
