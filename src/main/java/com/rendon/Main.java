 package com.rendon;

 import com.rendon.models.MindStone;
 import com.rendon.models.PowerStone;
 import com.rendon.models.RealityStone;
 import com.rendon.models.Stone;
 import com.rendon.service.GauntletService;
 import com.rendon.service.GauntletServiceImpl;

 public class Main {

    public static void main(String[] args) {

       final var gauntletService = new GauntletServiceImpl();



       gauntletService.useGauntlet("");
    }
}