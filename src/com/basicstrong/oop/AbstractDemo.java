package com.basicstrong.oop;
abstract class Demo1{
    public void display(){
        System.out.println("display");
    }
    public abstract void show();
}
public class AbstractDemo extends Demo1{
    public void show(){
        System.out.println("abstraction demo");
    }
    public static void main(String[] args) {
        AbstractDemo obj=new AbstractDemo();
        obj.show();
        obj.display();
    }
}
