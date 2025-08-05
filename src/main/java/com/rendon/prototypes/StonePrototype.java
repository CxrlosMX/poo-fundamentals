package com.rendon.prototypes;

import com.rendon.models.Stone;

@FunctionalInterface
public interface StonePrototype<S extends Stone> {  // Con esto indicamos que sera generico pero solamente de Stone(<S extends Stone> )

    S buildPrototype();

}
