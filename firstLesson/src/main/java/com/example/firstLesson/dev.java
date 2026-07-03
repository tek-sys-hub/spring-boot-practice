package com.example.firstLesson;


import org.springframework.stereotype.Component;

@Component
// by adding component spring understands he needs to manage this class
// Now spring will create the object of the class in the container
public class dev {

    public void build() {
        System.out.println("Learning Dependencies In Lesson First");
    }

}
