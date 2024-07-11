package com.encapsulation.p2;

import com.encapsulation.p1.A;// here the java imports class A in p1 package
/*
if it is default class it can not access in other packages
 */
public class X {
    A a;
    public static void main(String[] args) {
        A a1;
       // a1 = new A();
        //System.out.println(a1.age);
    }

}
