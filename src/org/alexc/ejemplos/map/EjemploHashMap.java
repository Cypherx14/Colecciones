package org.alexc.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        /*las llaves son unicas, los valores se pueden repetir*/
        /*usa hashcode e iquals  para verificar si una llave o valor son igual*/
        persona.put("nombre", "Ronaldo");
        persona.put("apellido", "Messi");
        persona.put("email", "inf@gmail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        
        
        
        


    }
}
