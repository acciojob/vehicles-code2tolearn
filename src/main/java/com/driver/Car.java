package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
   // private  String name ;

    public Car( String name,int wheels , String type , int doors , int gears , boolean isManual , int seats ) {
          super(name);
        //Hint: Car extends Vehicle
        this.wheels = wheels ;
         this.type = type ;
         this.doors = doors ;
         this.gears = gears ;
         this.isManual = isManual ;
         this.seats = seats ;
          currentGear =  1 ;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear){
          currentGear = newGear ;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed , newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
