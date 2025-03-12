package org.alexc.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        //con expresiones lambda
        Set<String> ts = new TreeSet<>((a,b) -> {
//            return 0;
            //para que sea al reves
            return b.compareTo(a);
        });
        //con Comparator.reverse
        Set<String> ts3 = new TreeSet<>(Comparator.reverseOrder());

        //los treeset tienen un costo adicional en rendimiento
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres"); //no permite duplicados
        ts.add("Cuatro");
        ts.add("Cinco");

        System.out.println("ts = " + ts);
    
        Set<Integer> tsNum = new TreeSet<>();
        tsNum.add(50);
        tsNum.add(20);
        tsNum.add(12);
        tsNum.add(5);
        tsNum.add(97);
        System.out.println("tsNum = " + tsNum);
    }
}
