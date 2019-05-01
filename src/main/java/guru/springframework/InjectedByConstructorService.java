package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
	private HelloworldService helloWorldService;
	@Autowired
	public InjectedByConstructorService(HelloworldService helloWorldService) {
		super();
		this.helloWorldService = helloWorldService;
	}
	public void getMessage(){
		helloWorldService.sayHello();
	}

}
