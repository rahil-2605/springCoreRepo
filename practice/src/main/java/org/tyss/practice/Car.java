package org.tyss.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
	@Autowired
	private Engine engine;

	 public void carMove() {
		 engine.engineStart();
		 System.out.println("Car is Moving ");
	 }

}
