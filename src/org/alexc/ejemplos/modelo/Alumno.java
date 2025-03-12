package org.alexc.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    /*@Override
    public int compareTo(Alumno alum) {
        if(this==null){
            return 0;
        }
        return this.nombre.compareTo(alum.nombre);

    }*/

    /*Comparando por nota*/

    /*
    @Override
    public int compareTo(Alumno alm) {
        if(this.nota == alm.nota){
            return 0;
        }
        if(this.nota > alm.nota){
            return 1;
        }else{
            return -1;
        }
    }*/

    /*Si cambiamos de double a Double clase wrapped ya se peude usar compareTo*/
    @Override
    public int compareTo(Alumno alm) {
        return this.nota.compareTo(alm.nota);
    }

    /*implementando equals y hashcode para el HashSet no permita duplicados*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", nota=" + nota;
    }
}
