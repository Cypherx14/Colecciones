package org.alexc.ejemplos.set;

import org.alexc.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EjemploArrayListMetodos {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();
        System.out.println(alumnos + " ,size " + alumnos.size());
        System.out.println("Esta vacia: " + alumnos.isEmpty());
        alumnos.add(new Alumno("Pato", 5));
        alumnos.add(new Alumno("Cata", 6.7));
        alumnos.add(new Alumno("Lucy", 4));
        alumnos.add(2,new Alumno("Jano", 2.9));
        alumnos.set(3,new Alumno("Andres", 11));

        System.out.println(alumnos + " ,size " + alumnos.size());

        alumnos.remove(new Alumno("Jano",2.9));
//        alumnos.remove(2);

        System.out.println(alumnos + " ,size " + alumnos.size());


        /*contains*/
        boolean flag = alumnos.contains(new Alumno("Jano",2.9));
        System.out.println("Contiene a Jano = " + flag);

        /*convertir ArrayList a array*/
        Object a[] = alumnos.toArray();
        for (Object obj: a){
            System.out.println(obj);
        }
    }
}
