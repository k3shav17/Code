package com.dailybyte;

class OuterClass  {
    public void callingMain() {
        Explaination ex = new Explaination();
        ex.addition(4);
    }
}
public class Explaination {

    int b = 10;
    public void addition(int a) {
        System.out.println(a * a);
    }
    public static void main(String[] args) {
        Keshav kesh = new Keshav();
        kesh.display();
        kesh.calling();
        kesh.messaging();

        Person person = new Person();
        person.setName("laxma");
        person.setAge(23);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

abstract class ThisIsAbstraction {
    public static void normalMethod () {
        System.out.println("This is inside normal method");
    }

    abstract void abstractMethod();
}

class Updating extends ThisIsAbstraction {

    @Override
    void abstractMethod() {
        System.out.println("this is akdjakgj");
    }
}
interface Laptop {
    void display();
}
class User implements Laptop {

    @Override
    public void display() {
        System.out.println("This laptop has a display");
    }
}

interface Phone {
    void display();
    void calling();
    void messaging();
    void messaging(String msg);
    default void video() {
        System.out.println("This is video");
    }
}
class Keshav implements Phone {


    @Override
    public void display() {
        System.out.println("This is display");
    }

    @Override
    public void calling() {

        System.out.println("I'm calling");
    }

    @Override
    public void messaging() {
        System.out.println("I'm messaging");
    }

    @Override
    public void messaging(String msg) {

    }

    public void Gaming() {
        System.out.println("I'm gaming");
    }

}

class Person {
    private String name;
    private double age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(double age){
        this.age = age;
    }
    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
