package org.tyss.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
    	DriverFeedback feedback=context.getBean(DriverFeedback.class);
    	feedback.feedback();
    }
}
