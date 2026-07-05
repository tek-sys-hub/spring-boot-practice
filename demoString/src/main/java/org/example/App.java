package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // This creates a container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            dev obj = context.getBean(dev.class);
        obj.build();
    }
}
