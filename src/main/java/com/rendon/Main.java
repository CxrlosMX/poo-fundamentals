 package com.rendon;

 import com.rendon.models.MindStone;
 import com.rendon.models.PowerStone;
 import com.rendon.models.RealityStone;
 import com.rendon.models.Stone;
 import com.rendon.prototypes.Prototypes;
 import com.rendon.service.GauntletService;
 import com.rendon.service.GauntletServiceImpl;

 public class Main {

    public static void main(String[] args) {

        //instance 01
       /* final var mind = new MindStone();

        System.out.println(mind);
        System.out.println(System.identityHashCode(mind));

        //instance 02
        final var mindPrototype= mind.getPrototype();
        System.out.println(mindPrototype);

        System.out.println(System.identityHashCode(mindPrototype));*/

        final var RealityStone = new RealityStone();
       final var gauntletService = new GauntletServiceImpl();
       gauntletService.setSoulStone(RealityStone);
       gauntletService.useGauntlet("reality");
    }
}