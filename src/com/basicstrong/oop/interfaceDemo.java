/*
Static:
 variables and methods can be declared as static whereas it cannot be done with the class.
An instance variable when declared as static it has to be accessed using class name as static members are more associated with the class more than that an object.
when a method is declared as static it can access only static variables.
one object changes the value of the static variable then the change will be applicable for all the objects that were created for the class.
The main method is declared as static. an object min to be created that contains the main method implicitly JVM takes care of it in calling the static method mean without creating the object.

 */
package com.basicstrong.oop;

interface demo2{
    public void m1();
    public void m2();
}
public class interfaceDemo implements demo2{
    public void m1(){
        System.out.println("method1");
    }
    public void m2(){
        System.out.println("method2");
    }
    public static void main(String[] args) {
        interfaceDemo obj=new interfaceDemo();
        obj.m1();
        obj.m2();
    }
}
