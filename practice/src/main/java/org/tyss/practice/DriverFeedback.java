package org.tyss.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DriverFeedback {
	@Autowired
	private Car car;
	public void feedback() {
		car.carMove();
		System.out.println("Car is running Smooth");
	}

}
