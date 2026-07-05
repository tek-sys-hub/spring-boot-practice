package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // This creates a container

        // This will automatically invoke the spring.xml where the obj are created
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        dev obj = (dev) context.getBean("dev");

        // with this we are directly calling the id we created
        // it returns obj type so we need to de the type cast it into dev type

        //            dev obj = context.getBean(dev.class);
//        obj.build();
    }
}
