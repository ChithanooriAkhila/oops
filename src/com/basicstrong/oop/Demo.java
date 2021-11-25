package com.basicstrong.oop;
class Fan{
    public boolean isOn;//instance variables
    Fan(boolean isOn){
        this.isOn=isOn;
    }
    public void turnOn(){
        isOn=true;
        System.out.println("fan is running ");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("fan is stop");
    }
    public void displayStatus(){
        System.out.println(isOn);
    }
}
class Addition{
    private static int val=0;
    public int sum(int a,int b){
        return a+b;
    }
    public static int getval(){
        return val;
    }
}
public class Demo {
    public static void main(String[] args) {
        Fan myFan=new Fan(true);//when object is created, default constructor is called and instance variables are initialized with default values.
        //myFan.turnOn();
        //myFan.turnOff();
        //myFan.isOn=true;
        Fan yourFan=new Fan(false);
        //Fan.isOn=true;
        //yourFan.isOn=false;
        myFan.displayStatus();
        yourFan.displayStatus();
        Addition add=new Addition();
        System.out.println(add.sum(10,20));
        System.out.println(Addition.getval());
    }
}
