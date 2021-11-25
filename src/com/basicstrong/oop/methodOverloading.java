/*
Method overloading:

Method overloading is a solution for compile time polymorphism.
 polymorphism can be achieved through method overloading.
 polymorphism means existing in many forms.
 method overloading happens when methods difference in method signature.
 method signature is in terms of number of parameters and the type of parameters.
 method signature is nothing to do with return type.
 there will be a compile time error when the method signature for both the methods is same and the return type is different.
 it will even throw an error if we pass two integers as an argument and the both the methods contains one I send and the other as double in one method and another method one is double and the second one is the end so it will be confused and will throw an error

 */
package com.basicstrong.oop;

public class methodOverloading {
    /*public void sum(int x,int y){
        System.out.println(x+y);
    }*/
    public void sum(int x,double y){
        System.out.println(x+y);
    }
    public void sum(double x,int y){
        System.out.println(x+y);
    }
    public void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
    /*public void sum(double x,double y){
        System.out.println(x+y);
    }*/
    public static void main(String[] args) {
        methodOverloading obj=new methodOverloading();
        //obj.sum(10,20);
        obj.sum(10,20,30);
        //obj.sum(10.0,12.2);
        //obj.sum(10,10);//error
    }
}
