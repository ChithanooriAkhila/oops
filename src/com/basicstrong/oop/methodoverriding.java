/*
Method overriding:
Runtime polymorphism can be achieved through method overriding.
 method overriding comes into the picture when there is inheritance.
 when there is the same method present in both superclass and subclass.
A method in the subclass overrides the method in superclass.
Broadly there are four ways in creating objects
1. subclass object and reference to superclass
2.  object and instance is subclass
3.  object and instance is superclass
4.  super class object and subclass instance( not valid)

 a method overriding happens in first case.
 */
package com.basicstrong.oop;

class MethodOverridingSuperClass {
    private String name="akhila";
    public void show(){
        System.out.println("superclass");
    }
}
public class methodOverridingSubClass extends MethodOverridingSuperClass{
    private String name="akhil";
    public void show(){
        System.out.println("subclass");
    }

    public static void main(String[] args) {
        methodOverridingSubClass obj=new methodOverridingSubClass();
        MethodOverridingSuperClass obj1=new methodOverridingSubClass();
        MethodOverridingSuperClass obj2=new MethodOverridingSuperClass();
        obj.show();
        obj1.show();
        obj2.show();
    }
}
