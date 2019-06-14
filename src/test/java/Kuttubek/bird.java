package com.company.classEs;

public class bird<psv> {
    int age =2;
    String name ="Khabib";
    String color ="Grey";
    String gender ="Male";
    String dateOfBirth= "04/27/2017";
    String kind ="eagle";
    int leg =2;
    int wings=2;
    boolean tail= true;
    boolean fly =true;
    boolean speak =true;
    int flightDistance =1000;
    boolean weather = true;

    public void fly() {
        System.out.println( "Kesha is flying" );

    }



    public static void main(String[] args) {


        bird Bird= new bird();// creating of the object
        System.out.println(Bird.name);
        System.out.println(Bird.age);
        System.out.println(Bird.leg);
        System.out.println(Bird.speak);

        String birdName= Bird.name;
        System.out.println(birdName);

    Bird.fly();// only i am calling the method fly which i have created.
        System.out.println(Bird.fly);// bird.fly is not a method
        // it is attributes of the class which we defined : boolean fly=true.Thats why it will print "true";


    }


}
