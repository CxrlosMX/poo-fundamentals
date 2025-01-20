package com.rendon.models;

import lombok.ToString;

@ToString
public class MindStone extends Stone{

    private static final String NAME = "Mind Stone";

    private static final String COLOR = "Yellow";

    private static final String LOCATION = "Housed in a scepter";

    private static final Integer ENERGY_LEVEL = 8;

    public MindStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Using Mind Stone: " + super.toString());
    }
}
