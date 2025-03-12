package org.alexc.ejemplos.set;

import org.alexc.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //con la expresion lambda sobreescribe el metodo de ordenamiento y se ordena por nombre y no nota
//        Set<Alumno> alumnos = new TreeSet<>((a,b) -> b.getNombre().compareTo(a.getNombre()));
        Set<Alumno> alumnos = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));

        alumnos.add(new Alumno("Pato", 5));
        alumnos.add(new Alumno("Cata", 6.7));
        alumnos.add(new Alumno("Lucy", 4));
        alumnos.add(new Alumno("Jano", 2.9));
        alumnos.add(new Alumno("Andres", 11));
        alumnos.add(new Alumno("Zeus", 10));

        System.out.println("alumnos = " + alumnos);

    }
}
