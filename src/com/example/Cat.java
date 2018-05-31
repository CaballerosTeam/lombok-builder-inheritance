package com.example;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Cat extends Animal {

    private boolean claws;

    @Builder
    public Cat(String name, boolean claws) {
        super(name);
        this.claws = claws;
    }

    @Override
    public void say() {
        System.out.println("mou-mou");
    }
}
