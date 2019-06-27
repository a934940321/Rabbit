package com.qf.entity;

public class Rabbit {

    private int age = 1;

    public void addAge(){
        age++;
    }

    public Rabbit son(){
        if (age>=3){
            return new Rabbit();
        }
        return null;
    }
}
