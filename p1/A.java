package com.encapsulation.p1;

 public class A {

    A a;

     protected int age = 20;

    /*
     1.the default instance variable can access only with in the same package
     2. public variables can access anywhere
     3.private variable can access only with in the class
     4.protected variables can access only same package and subclass of other packages
     using subclass objective
    */



     public static void main(String[] args) {
         A a1;
         a1 = new A();
         System.out.println(a1.age);
     }

}
