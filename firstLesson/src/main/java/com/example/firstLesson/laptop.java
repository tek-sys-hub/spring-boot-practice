package com.example.firstLesson;

import org.springframework.stereotype.Component;

@Component //We use component so we can invoke context like but we
// dont want to invoke it many time soo we use autowired its help to connect
public class laptop implements computer {

    public void compile () {
        System.out.println("Code is Compiling");
    }
}
