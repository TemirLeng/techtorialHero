package com.company.classEs;

public class cat {
    int age =3;
    String color ="white";
    String name = "Oreo";
    int leg = 4;
    int eyes =2;
    String eyeColor="Blue";
    boolean noice =true;
    int height =1;
    int weight =2;
    boolean hear = true;
    String gender = "female";
    String dateOfBirth= "03/05//2016";
    boolean aggressive =false;
    int speed = 10;


    public void move(){
        System.out.println("Oreo is moving");
    }
    public int Speed(){
        System.out.println(speed);
        return speed;
    }

    public static void main(String[] args) {
        cat cat  =new cat();
        System.out.println(cat.name);
       cat.move();
       cat.Speed(); //sout cat.speed . to print out
       String name =" Techt orial ";
        System.out.println(name.trim());

    }
    //create one method called eat to see how



}
