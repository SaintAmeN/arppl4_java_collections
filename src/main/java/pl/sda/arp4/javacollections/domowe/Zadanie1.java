package pl.sda.arp4.javacollections.domowe;

import java.util.*;

/**
 * Stwórz listę Integerów. Wykonaj zadania:
 * - dodaj do listy 5 elementów ze scannera
 * - dodaj do listy 5 elementów losowych
 * - wypisz elementy
 * Sprawdź działanie aplikacji.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
//            System.out.println("Podaj element:");
//            int elementWczytany = scanner.nextInt();
//            lista.add(elementWczytany);

            System.out.println("Podaj element:");
            lista.add(scanner.nextInt());
        }

        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
//            int liczba = generator.nextInt(100);
//            lista.add(liczba);

            lista.add(generator.nextInt(100));
        }

        System.out.println("Elementy listy:");
        System.out.println(lista);
    }
}
