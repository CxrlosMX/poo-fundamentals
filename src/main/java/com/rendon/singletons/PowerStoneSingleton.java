package com.rendon.singletons;

import com.rendon.models.MindStone;
import com.rendon.models.PowerStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PowerStoneSingleton {

    /*
    * -> Patron de diseño: Singleton: Consiste en tener una unica instancia del objeto, es util cuando queremos un objeto compartido
    * como por ejemplo un logger o una conexion a base de datos.
    * Paso para generar el patron singleton
    *   - Contructor privado
    *   - Un método static publico para poder acceder a la instancia
    *   -
    * */

    /**
     * Utilizamos la palabra reservada "volatile" para hacer visible la variable y asi evitar problemas de concurrencia,
     * y asi asegurar si más de un hilo interactuan con el tomen el valor más reciente
     * */
    private static volatile PowerStone powerStoneInstance;

    /*
    * Generamos nuestro contructor private para que nadie pueda acceder y NO pueda generar instancias
    * */
    private PowerStoneSingleton() {}


    /*
    * Generamos un método static para acceder a la instancia que usaremos,
    *                 lo que nos permite un método static es acceder a el
    *                                          atraves del nombre de la clase y no es necesario generar una instancia
    * */
    public static PowerStone getInstance() {
        /*
        * Para verificar que no tenemos una instancia, si la instancia
        * es null quiere decir que no tenemos una instancia
        * */
        if (powerStoneInstance == null) {
            /*
            * Utilizamos la palabra reservada "Synchronized" para garantizar
            * safe thread cuando más de un hilo acceda a este codigo este garantizada
            * que todos los hilos esten sincronizados cuando accedan.
            *
            * synchronized-> garantiza que solo un hilo a la vez ejecuten este código
            * */
            log.info("Creating the singleton instance"+ PowerStone.class);
            synchronized (PowerStoneSingleton.class) {

                /*
                * Verificamos una vez más  si es nulo, por que dos o más hilos pudieron llegar al mismo tiempo
                * a la validacion de la primera condición y puede que en ese proceso el valor haya cambiado
                * */
                if (powerStoneInstance == null) {
                    /*
                    * Si nuestro objeto sigue null, quiere decir que aun no se genera la instancia
                    * por ende "    CREAMOS NUESTRA INSTANCIA POR PRIMERA VEZ Y ULTIMA  "
                    * */
                    powerStoneInstance = new PowerStone();
                }
            }
        }
        /*
        * Regresamos nuestro objeto ya instanciado
        * */
        return powerStoneInstance;
    }


}
