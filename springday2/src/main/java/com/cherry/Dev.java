package com.cherry;

public class Dev {

    public Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build () {
        com.compile();
    }

    public Dev () {
        System.out.println("Dev Constructor");
    }

}
