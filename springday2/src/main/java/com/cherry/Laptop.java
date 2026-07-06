package com.cherry;

public class Laptop implements Computer {
    public Laptop (){
        System.out.println("Laptop Constructor Is Calling");
    }

    @Override
    public void compile () {}
}
