package com.basicstrong.oop;

class EncapsulationDemo {
    private int balance=10000;
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setBalance(5000);
        System.out.println(obj.getBalance());
    }
}
