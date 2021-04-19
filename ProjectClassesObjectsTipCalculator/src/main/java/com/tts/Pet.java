package com.tts;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;


    public String  getName(){
        return this.name;

    }

    public void setName(String name){
        this.name = name;

    }

    public int  getAge(){
        return this.age;

    }
    public void setAge(int age){
       this.age = age;

    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
         this.type = type;
    }


    public Pet(){

    this.name= "Dog";
    this.age = 4;
    this.location = "Maryland";
    this.type = "Akita";

    }

    public Pet(String name, int age, String location, String type){

        this.name= name;
        this.age = age;
        this.location = location;
        this.type = type;

    }

    public void myPet(){
        System.out.println("My Pet name is " + this.name + "." + "My Pet age is " + age + ","+ "My Pet location is " + location + "and My Pet type is " + type +".");
    }





    public static void main(String[] args) {


        Pet pet1 = new Pet();
        pet1.myPet();
        System.out.println();
        Pet pet2 = new Pet("cat",2,"Maryland"," SnowShoe");
        pet2.myPet();
    }
}

