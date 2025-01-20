package com.rendon.singletons;

import com.rendon.models.MindStone;
import com.rendon.models.SpaceStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    /*
    * volatile: Asegura la visibilidad y consistencia cuando más de un hilo interactuan con
    * este objeto, asegura que siempre tomen el valor más reciente
    * */
    private static volatile SpaceStone spaceStoneInstance;


    public static SpaceStone getInstance() {
        /*
        * verificamos que la instancia este en null
        *
        * */
        if (spaceStoneInstance == null) {
            /*
            * syncronized: Para garantizar la sincronizacion del los hilos
            * y asi un hilo a la vez ejecuten este código
            * */
            log.info("Creating the singleton instance"+ SpaceStone.class);
            synchronized (SpaceStoneSingleton.class){
                /*
                * Verificamos una vez más que nuestra instancia aun no este creada
                * */
                if (spaceStoneInstance == null) {
                    /*
                    * Generamos nuestra primer y ultima instancia
                    * */
                    spaceStoneInstance = new SpaceStone();
                }
            }
        }
        return spaceStoneInstance;
    }

}
