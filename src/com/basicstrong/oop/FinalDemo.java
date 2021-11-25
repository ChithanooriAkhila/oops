/*Non-access Modifiers:
1. Final
2. Static

 Final:
 Final can be applied with variables, methods, and classes.
If a variable is declared a final then its value is fixed and not be changed.
 If a method is declared as final then that method cannot be overridden
 if a class is declared as final then the class cannot be extended by any other class that means inheritance will not work when a class is declared as final this is about the final keyword which can be used with variables methods and classes as well.
*/
package com.basicstrong.oop;
class Demo2{
    public void show(){
        System.out.println("superclass");
    }
}
public class FinalDemo extends Demo2{
    //final int val=10;
    public void show(){
        //val=12;
        System.out.println("subclass");
    }
    public static void main(String[] args) {
        Demo2 obj=new FinalDemo();
        obj.show();
    }
}
