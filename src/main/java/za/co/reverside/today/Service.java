package za.co.reverside.today;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Service{

	@RequestMapping(path="api/yesterday")
	public String hello(){
		return "hello";
	}

	@RequestMapping(path="api/today")
	public String getToday(){
		return "Today";
	}

	@RequestMapping(path="api/calculate")
	public double num(){
		int a,b,c;

		a = 1;
		b = 2;
		c = b + a;

		return c;
	}

	@RequestMapping(path="api/cars", method= RequestMethod.GET)
	public Cars testgetCars(){
		Cars cars = new Cars();
		cars.setCarName("Audi");
		cars.setCarMake("A3");
		cars.setCarColor("Red");
		return cars;
	}

	@RequestMapping(path="api/postcars", method= RequestMethod.POST)
	public void postCar(@RequestBody Cars car){

		System.out.println(car.getCarName());
		System.out.println(car.getCarMake());
		System.out.println(car.getCarColor());

	}

}