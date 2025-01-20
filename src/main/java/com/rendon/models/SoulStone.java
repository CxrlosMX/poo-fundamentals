package com.rendon.models;

import lombok.ToString;

@ToString
public class SoulStone  extends Stone{
    private static final String NAME = "Soul Stone";

    private static final String COLOR = "Orange";

    private static final String LOCATION = "Planet Vormir";

    private static final Integer ENERGY_LEVEL = 6;

    public SoulStone() {
        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Using SoulStone power: "+   super.toString());
    }
}
