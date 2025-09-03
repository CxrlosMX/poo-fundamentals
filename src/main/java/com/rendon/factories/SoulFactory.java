package com.rendon.factories;

import com.rendon.models.Stone;
import com.rendon.prototypes.Prototypes;
import com.rendon.singletons.SoulStoneSingleton;

public class SoulFactory extends ConfigurableStoneFactory{

    @Override
    public Stone createStone() {
        if (super.isSingleton()){
            return SoulStoneSingleton.getInstance();
        }else {
            return Prototypes.powerStone.buildPrototype();
        }
    }
}
