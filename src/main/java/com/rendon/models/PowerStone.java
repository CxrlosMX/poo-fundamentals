package com.rendon.models;

import lombok.ToString;

@ToString
public class PowerStone extends Stone{

    private static final String NAME = "Power Stone";

    private static final String COLOR = "Purple";

    private static final String LOCATION = "Nova Corps";

    private static final Integer ENERGY_LEVEL = 9;

    public PowerStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower() {
        System.out.println("Using power stone: " + super.toString());
    }
}
