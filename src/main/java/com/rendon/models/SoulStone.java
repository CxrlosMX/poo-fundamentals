package com.rendon.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
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

    public SoulStone getPrototype(){
        try (
                /*convert object into bytes*/
                final var bos= new ByteArrayOutputStream();
                final var outs= new ObjectOutputStream(bos);){

            /*serialize the object: process of converting an object's state into a byte stream: JSON, XML, Bytes*/
            outs.writeObject(this);
            outs.flush();

            try(
                    /*deserialization of the objet: converting a byte stream back into a Java object*/
                    final var bis= new ByteArrayInputStream(bos.toByteArray());
                    final var ois= new ObjectInputStream(bis);
            ) {
                /*return and cast*/
                return (SoulStone) ois.readObject();
            }

        }catch (IOException | ClassNotFoundException e){
            log.warning("can´t getPrototype");
            throw new RuntimeException();
        }
    }
}
