package com.Zss.demo;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-04
 * Time:22:28
 **/
class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal :eat");
    }
    public void sleep(){
        System.out.println(this.name+"Animal: sleep");
    }
}
class Cat extends Animal{
   /* String name;
    public void eat(){
        System.out.println(this.name+"Cat: eat");
    }*/
}
class Bird{
    public String name;
    public void eat(){
        System.out.println(this.name+"Bird:eat");
    }
    public void fly(){
        System.out.println(this.name+"Bird: fly");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "(>^ω^<)喵";
        cat.eat();
    }
}
