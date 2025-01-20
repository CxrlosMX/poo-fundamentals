package com.rendon.models;


import lombok.ToString;

@ToString
public class SpaceStone extends Stone{

    private static final String NAME = "Space Stone";

    private static final String COLOR = "Blue";

    private static final String LOCATION = "Tesseract";

    private static final Integer ENERGY_LEVEL = 7;

    public SpaceStone() {

        super(NAME, COLOR, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower() {
        System.out.println("Using Space Stone: " + super.toString());
    }
}
