package com.rendon.models;

import lombok.ToString;

@ToString
public class RealityStone extends Stone{

    private static final String NAME = "Reality Stone";

    private static final String COLOR = "Red";

    private static final String LOCATION = "Aether";

    private static final Integer ENERGY_LEVEL = 5;

    public RealityStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Using Reality Stone: "+  super.toString());
    }
}
