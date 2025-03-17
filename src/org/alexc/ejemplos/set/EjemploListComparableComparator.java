package org.alexc.ejemplos.set;

import org.alexc.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Pato", 5));
        alumnos.add(new Alumno("Cata", 6.7));
        alumnos.add(new Alumno("Lucy", 4));
        alumnos.add(new Alumno("Jano", 2.9));
        alumnos.add(new Alumno("Andres", 11));
        alumnos.add(new Alumno("Zeus", 10));
        alumnos.add(new Alumno("Zeus", 10));

//        Collections.sort(alumnos, (a,b)-> b.getNombre().compareTo(a.getNombre()));
//        alumnos.sort((a,b)-> b.getNombre().compareTo(a.getNombre()));
        alumnos.sort(Comparator.comparing((Alumno a)-> a.getNota()).reversed());


        System.out.println("Iterando usando Stream forEach");
        /*usando expresiones lambda*/
//        alumnos.forEach(a -> System.out.println(a));
        alumnos.forEach(System.out::println); //optimizado

    }
}
