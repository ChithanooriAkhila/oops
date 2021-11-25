package com.basicstrong.oop;

public class publicDemo {
    //outer class cannot be private or protected
    /*The scope of public access specifiers is everywhere.
    The scope of private access specifier is within the class only in which it is there
            The scope of protected access specifier is within the same package and the subclass in any package.
    The scope of the default access specifier is within the same package only.*/
    /*Inner classes can be both private and protected.
 there is no concept of package inheritance in Java
    */
    private int a=0;
    protected void method(){
        int b=0;//local variable
        //we cannot restrict the scope of local variable as it is already defined
        System.out.println("public demo method");
    }
}
