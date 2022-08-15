package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        //HashSet Bastante rapido, mas nao garante a ordem dos itens
        Set<String> set = new HashSet<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();

        //TreeSet coloca os itens na ordem
        set1.add("Tv");
        set1.add("Notebook");
        set1.add("Tablet");

        for (String p1 :  set1) {
            System.out.println(p1);
        }
        System.out.println();

        //Diferente o HashSet o LinkedSet mantem a ordem dos que os elementos foram inseridos
        set2.add("Tv");
        set2.add("Notebook");
        set2.add("Tablet");

        set2.remove("Tv");

        for (String p2 : set2) {
            System.out.println(p2);
        }
    }
}
