package org.alexc.ejemplos.set;

import org.alexc.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("Pato", 5));
        alumnos.add(new Alumno("Cata", 6.7));
        alumnos.add(new Alumno("Lucy", 4));
        alumnos.add(new Alumno("Jano", 2.9));
        alumnos.add(new Alumno("Andres", 11));
        alumnos.add(new Alumno("Zeus", 10));
        alumnos.add(new Alumno("Zeus", 10));

//        System.out.println("alumnos = " + alumnos);
        System.out.println("Iterando con foreach");
        for (Alumno a : alumnos){
            System.out.println(a);
        }
        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = alumnos.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }

    }
}
