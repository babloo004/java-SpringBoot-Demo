package com.avinash.Springboot;


import org.springframework.stereotype.Component;

@Component //@Component annotation used to tell the SpringBoot to create object
public class Alien {

    //Instance Variable
    private int age;

    //Constructor

    //Normal
    public Alien(){
        System.out.println("Alien is created...!");
    }

    //Parameter Constructor
    public Alien(int age){
        this.age = age;
    }

    //setter

    //setAge()
    public void setAge(int age){
        System.out.println("setAge();");
        this.age = age;
    }

    //getter

    //getAge()
    public int getAge(){
        System.out.println("age : "+this.age);
        return this.age;
    }

    //methods

    //code
    public void code(){
        System.out.println("Coding...!");
    }
}
