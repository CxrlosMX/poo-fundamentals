package com.rendon.singletons;

import com.rendon.models.MindStone;
import com.rendon.models.SoulStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {
    /*
    * volatile: garantiza la visibilidad y consistencia de la variable para siempre tener el valor más reciente
    * esto ayuda a mantener una concurrencia segura
    * */
    private static volatile SoulStone soulStoneInstance;

    public static SoulStone getInstance() {

        if (soulStoneInstance == null){
            /*
            * syncronized: para sincronizar los hilos que llegaran al método
            *                                                            y asi asegurar que un hilo a la vez se ejecuten..
            * */
            log.info("Creating the singleton instance"+ SoulStone.class);
            synchronized (SoulStoneSingleton.class){
                /*
                Verificamos que el objeto este null
                * */
                if (soulStoneInstance == null){
                    /*
                    * Creamos la primera y unica instancia del objeto
                    * */
                    soulStoneInstance = new SoulStone();
                }
            }
        }
        return soulStoneInstance;
    }
}
