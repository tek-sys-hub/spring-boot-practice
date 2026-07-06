package com.cherry;

public class Desktop implements Computer {
    public Desktop (){
        System.out.println("Desktop Constructor Is Calling");
    }
    public void compile () {
        System.out.println("Desktop is compiling");
    }
}
