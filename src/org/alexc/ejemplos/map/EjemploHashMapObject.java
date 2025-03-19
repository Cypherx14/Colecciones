package org.alexc.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapObject {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos = " + !persona.isEmpty());

        /*las llaves son unicas, los valores se pueden repetir*/
        /*usa hashcode e iquals  para verificar si una llave o valor son igual*/
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
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        /*obtener la direccion*/
        System.out.println("*******OBTENIENDO EL MAP DE DIRECCION Y TRABAJARLO***********");
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        System.out.println("direccionPersona = " + direccionPersona);
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String estado = direccionPersona.get("estado");
        System.out.println("pais = " + pais + "estado = " + estado + " ciudad = " + ciudad);

        
        /*eliminar por su key*/
        /*
        persona.remove("email"); //RETORNA EL VALOR ELIMINADO
        String eliminado = persona.remove("email"); //RETORNA EL VALOR ELIMINADO
        */
        /*eliminar por key y valor*/
        boolean eliminado2 = persona.remove("email", "info@gmail.com");
        System.out.println("Eliminado? : " + eliminado2);

        System.out.println("persona = " + persona);

        /*METODOS IMPORTANTES DE MAP*/
        System.out.println("*********METODOS PRINCIPALES MAP*********");
//        persona.clear(); //elimina todos los valores
        System.out.println(persona.containsKey("nombre"));// verifica si existe una key, boolean
        System.out.println(persona.containsValue("Messi")); // verifica si existe un valor, boolean
        //obtener todos los valores del map
        System.out.println("*********** values");
        Collection<Object> valores = persona.values();
        for (Object valo : valores){
            System.out.println("valor = " + valo);
        }
        System.out.println("*********** keySet");
        Set<String> keys = persona.keySet();
        for(String key: keys){
            System.out.println("key = " + key);
        }
        System.out.println("*********** entrySet");
        for(Map.Entry<String, Object> par : persona.entrySet()){
            System.out.println("key  = " + par.getKey() + " | valor = " + par.getValue());
        }
        System.out.println("*********** keySet");
        for(String key : persona.keySet()){
            Object valor = persona.get(key);
            System.out.println("key = " + key + " | valor = " + valor);
        }
        System.out.println("*********** lambda");
        persona.forEach((key, value) -> {
            System.out.println("key = " + key + " | valor = " + value);
        });

        System.out.println("total = " + persona.size()); //obtener el total de elementos
        System.out.println("Contiene elementos = " + !persona.isEmpty()); //verificar si esta vacio

        
//        persona.replace("nombre", "Leonel"); //retorna el elemento a modificar
        String nombreAnterior = (String) persona.replace("nombre", "Leonel"); //retorna el elemento a modificar
        System.out.println("nombreAnterior = " + nombreAnterior);
        System.out.println("persona = " + persona);
        
        boolean seReemplaza = persona.replace("nombre", "Juan", "Andres"); //retorna un boolean
        System.out.println("seReemplaza si el antiguo valor es Juan = " + seReemplaza);

    }
}
