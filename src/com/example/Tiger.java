package com.example;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Tiger extends Cat {

    private boolean strips;

    @Builder
    public Tiger(String name, boolean claws, boolean strips) {
        super(name, claws);
        this.strips = strips;
    }

    public static class TigerBuilder extends CatBuilder {
        TigerBuilder() {
            super();
        }
    }

    @Override
    public void say() {
        System.out.println("R-r-r");
    }
}
