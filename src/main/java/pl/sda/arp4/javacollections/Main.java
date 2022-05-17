package pl.sda.arp4.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Lista immutable - niezmienna
        List<Integer> listaDoSkopiowaniaAleNieUzywania = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(listaDoSkopiowaniaAleNieUzywania);
//        listaDoSkopiowaniaAleNieUzywania.remove(1); // nie działa
//        listaDoSkopiowaniaAleNieUzywania.add(10); // nie działa

        List<Integer> lista = new ArrayList<>(listaDoSkopiowaniaAleNieUzywania);
        System.out.println(lista);

        // dodanie na koniec
        lista.add(6);
        System.out.println(lista);

        // dodanie większej ilości elementów
        lista.addAll(Arrays.asList(100, 200, 300));

        lista.remove(1);
        System.out.println(lista);

        // przeiterować
        // znaleźć, pod którym indeksem
        int indeksPiątki = lista.indexOf(5);

        // jeśli znaleźliśmy to usuń ten index
        lista.remove(indeksPiątki);

        // ^ zamiast dwóch instrukcji u góry możemy zrobić:
        Integer obiektDoUsuniecia = 5;
        lista.remove(obiektDoUsuniecia);

        // ^ lub
        lista.remove((Object)5);
        lista.remove(Integer.valueOf(5));
    }
}
