package com.rendon.models;

import lombok.*;

import java.io.Serializable;

/*
* @Getter: Lombok genera los métodos getters
* @Setter: Lombok genera los métodos setters
* @AllArgsContructor: Lombok genera un contructor con todos los parametros
* @NoAllArgsContructor: Lombok genera un contructor por default sin ningun parametro
* @EqualsAndHashCode: Lombok para que no sobreescriba el método squals and hashcode
 * */
@Setter
@Getter
/*@AllArgsConstructor*/
//@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Stone implements Serializable {

    protected String name;

    protected String color;

    protected String location;

    protected Integer energyLevel;

    protected Integer numberOfSides;



    /*
    * Creamos una constante por que este valor nunca va cambiar y sera usado en todas las
    * clases hijas
    * **Las constantes van en mayusculas
    * */
    private static final Integer NUMBER_OF_SIDES = 6;


    public Stone(String name,
                 String color,
                 String location,
                 Integer energyLevel)
    {
        this.name = name;
        this.color = color;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_OF_SIDES    ;
    }

    public  abstract void usePower();
}
