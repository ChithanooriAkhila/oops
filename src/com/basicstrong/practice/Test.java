package com.basicstrong.practice;

import com.basicstrong.oop.publicDemo;

public class Test extends publicDemo{
    public static void main(String[] args) {
        Test demo=new Test();
        demo.method();//protected methods can be accessible through child objects only
    }
}
