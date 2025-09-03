package com.rendon.optional;

import lombok.extern.java.Log;

import java.util.Optional;

@Log
public class OptionalFeactures {
    public static void main(String[] args) {

        /**
         * En java acceder a una variblr null lanza una exception NullPointerException
         * Optional: te obliga a pensar en si un valor puede estar presente o no y manejarlo correctamente
         *
         *
         * */

        Optional<String> name= Optional.ofNullable("Luis");


        Optional<Integer> number= Optional.ofNullable(10);

        // Creamos un optional vacio
        Optional<String> empty= Optional.empty();

        if (name.isPresent()) {
            System.out.println("El valor del name es: " + name.get());
        }else {
            System.out.println("El valor del name es: " + name.get());
        }

        name.ifPresent(n -> System.out.println("El valor del name es: " + n));


        User user= new User(null,24,"rendon");

        User user1=null;

        System.out.println(user.getName());

        Optional<User> user2= Optional.ofNullable(user1);

        // Valida si el objeto esta presente o no es null y hace una accion
        user2.ifPresent(user3 -> System.out.println("El valor del name es: " + user3.getName()));

        // Podemos tener condiciones si el valor no esta presente podemos imprimir un mensaje alternativo
        String valor= name.orElse("Default");


        String token= "-1";

        Optional<String> token1= Optional.of(token);

        Optional.of(token).map(s -> false).orElseThrow(RuntimeException::new);

    }
}
