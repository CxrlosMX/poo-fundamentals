package com.rendon.service;

import com.rendon.models.SoulStone;
import com.rendon.models.Stone;
import lombok.extern.java.Log;

//@Service
@Log
public class GauntletServiceImpl implements GauntletService {


    private final Stone soulStone=new SoulStone();

    @Override
    public void useGauntlet(String stoneName) {
    log.info("Using the stone " + soulStone);
    }
}
