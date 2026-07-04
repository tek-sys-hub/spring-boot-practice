package com.example.firstLesson;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Now our compiler is confused which to pick cause we have now 2 classes that implements computer
// So autowire now have 2 beans to inject
// there are 2 solution of it
// 1. Delete desktop class
// 2. Delete Component form desktop class

//  In case of confusion we can create add new annotation called primary
// then the autowire focus one the primary one

   @Component

   //We use component so we can invoke context like but we
// dont want to invoke it many time soo we use autowired its help to connect
public class desktop implements computer {

    public void compile () {
        System.out.println("Code is Compiling But Faster");
    }
}
