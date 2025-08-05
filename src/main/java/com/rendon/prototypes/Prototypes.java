package com.rendon.prototypes;

import com.rendon.models.MindStone;
import com.rendon.models.PowerStone;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {
    /**
     * SI TENEMOS UNA CLASE QUE CON PUROS METODOS ESTATICOS
     * * Podemos usar el @AllArgsConstructor con el access = AccessLevel.PRIVATE
     * * De esta manera evitamos que se pueda instanciar la clase
     * * Esto es util cuando tenemos una clase de utilidades
     * * Por ejemplo, si tenemos una clase de utilidades para crear prototipos
     * **/

    public static StonePrototype<PowerStone> powerStone;


}
