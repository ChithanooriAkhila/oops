package com.basicstrong.oop;

class DataHidingDemo{
    private int balance=10000;
    private String name="akhila";
    private String password="password";
    public int displayBalance(String name,String password){
        if(this.name==name && this.password==password){
            return balance;
        }
        return 0;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        DataHidingDemo obj=new DataHidingDemo();
        System.out.println(obj.displayBalance("akhila","password"));
        System.out.println(obj.displayBalance("akila","password"));
    }
}
