package org.example;
public class dev {
    // Now we know how to work on simple variables like int

    // But for laptop which is a class reference how can we do that

    private laptop laptop; // Now I want to implement laptop here in the dev
        // This is just reference not any object

    // Instead of using getter setter we now use constructor

    public dev(laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 is running");
    }

    // So we need to create an object if it

//    public int getAge() {
//        return age;
//    }

//    public dev(int age , int salary) {

    public laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(laptop laptop) {
        this.laptop = laptop;
    }
//        this.age = age;
//        System.out.println("Dev Output");
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    private int age;
//    public dev () {
//        System.out.println("Dev is using");
//    }

    public void build() {
        System.out.println("Learning Spring Without Boot");
        laptop.compile();
    }

}