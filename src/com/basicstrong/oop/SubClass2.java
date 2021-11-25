/*
Inheritance
There are five kinds of inheritance:
1. Single inheritance
2. multilevel inheritance
3. multiple inheritance
4. hierarchical inheritance
5. hybrid inheritance

 single inheritance: class extends another class.
multilevel inheritance: one class inheritance The Other class and this class is extended by other class in multiple levels.
it can contain multiple levels of inheritance
 multiple inheritance: multiple inheritance is not supported in Java multiple inheritance means a class extends more than one class but multiple inheritance can be achieved through interfaces.
 Multiple inheritance is not supported in Java because when can a class extends more than multiple class is the same method can be present in both the methods so the compiler gets confused to extend which method of the classes.
 multiple inheritance can be achieved through interfaces and and there will not be any issue in case of multiple inheritance in interfaces because in interfaces it contains abstract method which contains no implementation at all for the class which extends or implements this interface has to implement the methods so the declaration will be twice but the implementation has to be done in the class which implements that interface.
 Hierarchical inheritance is a class multiple classes extends A one class
 hybrid inheritance is the combination of multiple inheritance and hierarchical interactions as multiple inheritance is not supported in Java hybrid inheritance is also not present in Java and and there is an the type of inheritance which is cyclic inheritance it is nothing but a  a class inheritance The Other class and the traffic inheritance discuss so so all the all the trees will be present in both both the classes so it means the same so there is no need of creating the other class it is not supported in Java

 */
package com.basicstrong.oop;

class SuperClass {
 public void show(){
  System.out.println("superclass");
 }
}
class SubClass1 extends SuperClass{
 public void display(){
  System.out.println("subclass1");
 }
}

public class SubClass2 extends SubClass1{
 public void print(){
  System.out.println("subclass2");
 }
 public static void main(String[] args) {
  SubClass2 obj=new SubClass2();
  obj.print();
  obj.show();
  obj.display();
 }
}
