package com.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {

    String name;

    public void say() {
        throw new NotImplementedException();
    }
}
