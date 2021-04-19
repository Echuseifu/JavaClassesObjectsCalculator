package com.tts;

public class Car {

    private String model;
   private String maker;
    private int year;

    public String  getModel(){
        return this.model;

    }
    public void setModel(String model){
        this.model= model;

    }
    public String  getMaker(){
        return this.maker;

    }
    public void setMaker(String maker){
        this.maker = maker;

    }
    public int  getYear(){
        return this.year;

    }

    public void setName(int year){
        this.year= year;

    }


    public Car(){

        this.model= "Sport";
        this. maker = "Toyota";
        this.year = 2021;


    }

    public Car(String model, String maker){

        this.model= model;
        this.maker = maker;

    }

    public Car(String model, String maker,  int year){

        this.model= model;
        this.maker = maker;
        this.year = year;


    }


    public String carInfo(){

        String carInfo = "This is " + maker + " " + year + " " + model + " Car!";
        return carInfo;
    }

    public boolean checkModel(){
        if(model.equalsIgnoreCase("Sport") ){

            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carInfo();
//        car1.checkModel("sport");
        System.out.println(car1.carInfo());
        System.out.println(car1.checkModel());


    }
}
