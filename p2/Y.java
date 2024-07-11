package com.encapsulation.p2;

import com.encapsulation.p1.A;// here we also access the class by using import
/*
        if it is default class it can not access in other packages
 */

public class Y extends A{
    A a;
    public static void main(String[] args) {
       Y y;
       y = new Y();
        System.out.println(y.age);
    }

}
