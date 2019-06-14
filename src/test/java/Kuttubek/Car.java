package com.company.classEs;

public class Car {
//    Create one class name is CAR
//            Create 10 different attributes for car class. Example ( door, windows, engine, color, model, tire, seat, type, name, speed, heat, break=false etc)
//    Create 2 different object using this class.
//    Change color, model, name, for one of the object.
//    Create five different method
//    first increaseSpeed with 15 return type is int.
//    Second changeGear return type is int. Increase gear with 1.
//    Third decreaseSpeed with 20 return type is int.
//    Four increaseHeat with 30 return type is int
//    Five stopCar return type boolean return break attribute as a false.
    int door = 2;
    int window = 6;
    boolean engine = true;
    String color = "white";
    String model = "Mazda";
    int tire = 4;
    int seat = 5;
    String type = "sedan";
    boolean heat = true;
    boolean breaks = false;
    int speed =30;
     int switchGear= 6;
public int  openDoor(){
        return door+2;
    }
    public int liftWindow(){
    return window-4;
    }public int getSeat(){
    return seat=3;
    }public int CheckTire(){
    return tire;
    }public int IncreaseSpeed_(){
    return +15;
    }public int getSwitchGear() {
        return switchGear = 1;
    }public int getSpeed() {
        return speed-20;
    }boolean CheckEngine(){
      return engine ==true;
    }public boolean checkBrakes(){
    return  breaks==true;
    }boolean isHeat(){
    return true;
    }

    public static void main(String[] args) {
        Car myCar =new Car();
        myCar.openDoor();
        myCar.liftWindow();
        myCar.getSeat();
        myCar.CheckTire();
        myCar.IncreaseSpeed_();
        myCar.CheckEngine();
        myCar.checkBrakes();
        myCar.getSwitchGear();
        myCar.getSpeed();
        myCar.isHeat();






    }
}