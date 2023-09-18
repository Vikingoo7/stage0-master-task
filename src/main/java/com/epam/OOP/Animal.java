package com.epam.OOP;
public class Animal {

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.getDescription());

        Dog dog = new Dog();
        System.out.println(dog.getDescription());
    }


    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String prefix;
        if(hasFur) {
            prefix = "a";
        } else {
            prefix = "no";
        }
        String paws;
        if(numberOfPaws > 1) {
            paws = "paws";
        } else {
            paws = "paw";
        }

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paws + " and " + prefix + " fur.";

    }
}
