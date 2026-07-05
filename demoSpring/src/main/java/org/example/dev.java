package org.example;
public class dev {

    private laptop laptop; // Now I want to implement laptop here in the dev
        // This is just reference not any object

    // So we need to create an object if it

    public int getAge() {
        return age;
    }

    public dev(int age , int salary) {
        this.age = age;
        System.out.println("Dev Output");
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public dev () {
        System.out.println("Dev is using");
    }

    public void build() {
        System.out.println("Learning Spring Without Boot");
    }

}