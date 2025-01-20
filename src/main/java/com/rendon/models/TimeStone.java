package com.rendon.models;

import lombok.ToString;

@ToString
public class TimeStone extends Stone{

    private static final String NAME = "Time Stone";

    private static final String COLOR = "Green";

    private static final String LOCATION = "Eye of Agamotto";

    private static final Integer ENERGY_LEVEL = 10;

    public TimeStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Using Time Stone"  + super.toString());
    }
}
