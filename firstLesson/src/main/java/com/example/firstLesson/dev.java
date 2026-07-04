package com.example.firstLesson;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// by adding component spring understands he needs to manage this class
// Now spring will create the object of the class in the container
public class dev {

    @Autowired  // this is known as field injection

            // Now spring will automatically connect them and create a instance

    private laptop laptop;

    public void setLaptop (laptop laptop) { // setter injector


        // We use autowired here to connect
        this.laptop = laptop;
    }

   /* public dev(laptop lap) { // Constructor injection
        this.lap = lap;
    }*/

    public void build() {

       laptop.compile();
        System.out.println("Learning Dependencies In Lesson First");
    }

}
