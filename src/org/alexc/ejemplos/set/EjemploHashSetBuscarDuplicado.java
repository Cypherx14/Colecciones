package org.alexc.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = { "corvina", "lenguado","pejerrey",
        "robalo", "atun", "lenguado"};

        Set<String> pecesUnicos = new HashSet<>();
        Set<String> pecesDuplicados = new HashSet<>();

        for (String pez: peces){
            if(!pecesUnicos.add(pez)){
                System.out.println("pez duplicado= " + pez);
                //asignar los duplicados a otro HashSet
                pecesDuplicados.add(pez);
                //eliminar el duplicado del hashsetunico
                //mejor de la manera de abajo
//                pecesUnicos.remove(pez);
            }
        }
        //eliminar de pecesUnicos los que son duplicados
        pecesUnicos.removeAll(pecesDuplicados);
        System.out.println("pecesUnicos = " + pecesUnicos);
        System.out.println("pecesDuplicados = " + pecesDuplicados);
    }
}
