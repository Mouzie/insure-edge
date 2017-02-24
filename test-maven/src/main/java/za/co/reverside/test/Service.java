package za.co.reverside.test;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class Service {

    @RequestMapping(value="hello")
	public String sayHello(){
		
		return "Hello World";
	}

	@RequestMapping(value="time")
	public String getTime(){
		return new Date().toString();
	}

	@RequestMapping(value="number")
	public int num(){

		int i = 1, x =3;

		int total = i + x;

		return total;
	}
}