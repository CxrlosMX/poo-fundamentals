package com.rendon.service;

import com.rendon.models.SoulStone;
import com.rendon.models.Stone;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServiceImpl implements GauntletService {


    private Stone reality;

    public GauntletServiceImpl() {
    }

    @Override
    public void useGauntlet(String stoneName) {
        /**
         * Usamos un swith case con lamda
         *
         */
        switch (stoneName){
            case "reality" -> log.info("Use stone "+reality);
            default -> throw new IllegalArgumentException("Invalid stone name");
        }

    }

    @Override
    public void useFullPower() {

    }

    /**
     * Inyección de dependencias via setter
     */
    public void setSoulStone(Stone reality) {
        this.reality = reality;
    }
}
