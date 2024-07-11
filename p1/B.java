package com.encapsulation.p1;

public class B {
    /*
            if it is default class it can  access in the same  packages
 */
    A a;
    public static void main(String[] args) {
        A a1;
        a1 = new A();
        System.out.println(a1.age);
    }
}
