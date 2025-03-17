package org.alexc.ejemplos.set;

import org.alexc.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedListMetodos {
    public static void main(String[] args) {

        LinkedList<Alumno> alumEnlazada = new LinkedList<>();
        System.out.println(alumEnlazada + " ,size " + alumEnlazada.size());
        System.out.println("Esta vacia: " + alumEnlazada.isEmpty());
        alumEnlazada.add(new Alumno("Pato", 5));
        alumEnlazada.add(new Alumno("Cata", 6.7));
        alumEnlazada.add(new Alumno("Lucy", 4));
        alumEnlazada.add(new Alumno("Jano", 2.9));
        alumEnlazada.add(new Alumno("Andres", 11));

        System.out.println(alumEnlazada + " ,size " + alumEnlazada.size());

        alumEnlazada.addFirst(new Alumno("Kratos", 5));
        alumEnlazada.addLast(new Alumno("Poseidon", 4));
        System.out.println(alumEnlazada + " ,size " + alumEnlazada.size());

        /*obtener el primer elemento, si la lista esta vacia lanza exception*/
        System.out.println("Primero " + alumEnlazada.getFirst());
        /*obtener el primer elemento, pero no lanza exception si la lista esta vacia., retorna null*/
        System.out.println("Primero " + alumEnlazada.peekFirst());
        /*obtener el ultimo elemento*/
        System.out.println("Ultimo " + alumEnlazada.getLast());
        /*obtener el ultimo elemento, pero no lanza exception si la lista esta vacia., retorna null*/
        System.out.println("Ultimo " + alumEnlazada.peekLast());
        /*obtener elemento mediante indice*/
        System.out.println("Indice 2 " + alumEnlazada.get(2));

        /*eliminar primer elemento, igualmente lanza exception*/
        Alumno kratos = alumEnlazada.removeFirst(); //lo elimina y retorna el elemento
        /*eliminar primer elemento, no lanza exception si la lista esta vacia, retorna true*/
        Alumno pato = alumEnlazada.pollFirst(); //lo elimina y retorna el elemento
        /*eliminar el ultimo*/
        alumEnlazada.removeLast();

        /*eliminar por indice*/
//        Alumno janoEliminado = alumEnlazada.remove(2); //retorna el elemento
        /*eliminar por objeto, retorna true o false*/
        alumEnlazada.remove(new Alumno("Jano",2.9)); //retorna el elemento
        System.out.println(alumEnlazada + " ,size " + alumEnlazada.size());

        Alumno atenea = new Alumno("Atenea", 1.78);



    }
}
