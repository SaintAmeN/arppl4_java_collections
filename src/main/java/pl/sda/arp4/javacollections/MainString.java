package pl.sda.arp4.javacollections;

import java.util.ArrayList;
import java.util.Arrays;

public class MainString {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        System.out.println(lista);

        lista.add(3, "6");
        System.out.println(lista);

        // dodanie większej ilości elementów
        lista.addAll(Arrays.asList("100", "200", "300"));

        lista.remove(1);
        System.out.println(lista);
    }
}
