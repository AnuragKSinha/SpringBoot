package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SetterBasedService {
	private HelloworldService helloworldservice;

	public HelloworldService getHelloworldservice() {
		return helloworldservice;
	}
	@Autowired
	public void setHelloworldservice(HelloworldService helloworldservice) {
		this.helloworldservice = helloworldservice;
	}
	public void getMessage(){
		helloworldservice.sayHello();
	}

}
