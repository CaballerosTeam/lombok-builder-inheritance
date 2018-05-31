package com.example;

import lombok.Builder;

public class Dog extends Animal {

    private boolean teeth;

    @Builder
    public Dog(String name, boolean teeth) {
        super(name);
        this.teeth = teeth;
    }

    @Override
    public void say() {
        System.out.println("wou-wou");
    }
}
