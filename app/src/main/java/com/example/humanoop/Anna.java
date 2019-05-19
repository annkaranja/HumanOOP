package com.example.humanoop;

public class Anna extends Human {
    private int height;
    public Anna(String name, int weight, int age) {
        super(name, weight, age);
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        weight = weight + 2;
    }

    @Override
    public int birthday() {
        age = age + 5;
        return age;
    }
}
