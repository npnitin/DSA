package com.example.DSA;


class Animal{
    public Animal(){
        System.out.println("inside animal");
    }
}
class Dog extends Animal{
    public Dog(){
        System.out.println("inside Dog");
    }
}
class Labrador extends Dog{
    public Labrador(){
        System.out.println("inside labrador");
    }
}
public class ConstructorHierarchy {

    public static void main(String[] args) {
        Labrador l = new Labrador();
    }


}
