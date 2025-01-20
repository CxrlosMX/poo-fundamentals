package com.rendon.singletons;

import com.rendon.models.MindStone;
import com.rendon.models.RealityStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {

    /*
    * volatile: garantiza visibilidad y consistencia, cuando más de un hilo interacturen con ella
    * tomaran el valor más reciente y sera actualizado inmediatamente
    * */
    private static volatile RealityStone realityStoneSingleton;

     public static RealityStone getInstance() {
         /*
         * Verificamos si la instancia es null
         * */
         if(realityStoneSingleton == null){

             /*
             * Safe thread: Utilizamos "Syncronized" para indicar que si más de un hilo se
             * sincronicen al interactuar con este método, asi garantizamos una concurrencia segura
             *
             * */
             log.info("Creating the singleton instance"+ RealityStone.class);
             synchronized (RealityStoneSingleton.class){

                 /*
                 * Verificamos una vez más si el objeto es null
                 * por que tal vez en el primer if pudieron entrar dos hilos y en ese transcurso
                 * pudieron cambiar los datos
                 * */
                 if(realityStoneSingleton == null){
                     /*
                     * Creamos la primera y unica instancia
                     * */
                     realityStoneSingleton = new RealityStone();
                 }
             }

         }

         return realityStoneSingleton;
     }
}
