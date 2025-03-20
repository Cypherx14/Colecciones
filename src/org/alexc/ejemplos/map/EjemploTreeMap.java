package org.alexc.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
//        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
//        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));


        /*TreeMap ordena por defecto por la key*/
        persona.put("nombre", "Ronaldo");
        persona.put("apellido", "Messi");
        persona.put("email", "info@gmail.com");
        persona.put("edad", "30");

        /*map del tipo object */
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "EEUU");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("postal", "123");

        /*agregar el map direccion al map persona*/
        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);
    }
}
