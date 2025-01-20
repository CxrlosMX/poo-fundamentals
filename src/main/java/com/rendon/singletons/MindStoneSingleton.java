package com.rendon.singletons;

import com.rendon.models.MindStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
//@NoArgsConstructor(access = AccessLevel.PRIVATE) //Podemos modificar el modificador de acceso del contructor
public class MindStoneSingleton {

    /*
    *  volatile: Garantizamos la visibilidad  y constancia QUE SERA compartida por más de un hilo
    *   Se garantiza que cualquier cambio hecho por un hilo en la variable sea visible inmediatamente en los demas
    * hilos. Esto significa que los hilos siempre leeran el valor más reciente
    * */
    private static volatile MindStone mindStoneInstance;


    /*
    * Generamos un contructor privado
    * */
    private MindStoneSingleton() {}


    /*Generamos un método "static" publico para poder acceder
    * a la instancia*/
    public static MindStone getInstance() {
        if (mindStoneInstance == null) {
            /*La palabra "synchronized" asegura que los hilo se sincronicen
            * y solo un hilo a la vez ejecuten este código, esto para garantizar
            * la concurrencia
            * */
            log.info("Creating the singleton instance"+ MindStone.class);
            synchronized (MindStoneSingleton.class) { // De esta manera esta clase estara sincronizada
                if (mindStoneInstance == null) {
                    mindStoneInstance= new MindStone();
                }
            }
        }
        return mindStoneInstance;
    }

}
