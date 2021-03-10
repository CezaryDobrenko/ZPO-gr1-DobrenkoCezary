package com.company.lab01.zadanie3;

public class Car {
    private CarSpeed carState;
    private String name;

    public Car(CarSpeed carState, String name)
    {
        this.carState = carState;
        this.name = name;
    }

    public void changeCarState(CarSpeed carState){
        this.carState = carState;
    }

    public void showCarName()
    {
        System.out.println(this.name);
    }

    public void printMaxSpeed(){
        System.out.println(this.carState.getMaxSpeed());
    }

}
