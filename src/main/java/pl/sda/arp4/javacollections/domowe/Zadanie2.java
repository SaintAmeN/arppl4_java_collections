package pl.sda.arp4.javacollections.domowe;

import java.util.*;

/**
 * Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
 * - dodaj do listy 10 liczb losowych
 * - oblicz sumę elementów na liście (wypisz ją)
 * - oblicz średnią elementów na liście (wypisz ją)
 * - podaj medianę elementów na liście (wypisz ją)
 * - znajdź największy oraz najmniejszy element na liście
 * - po znalezieniu elementu znajdź index elementu używając kolejnej pętli for
 * - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
 * <p>
 * Sprawdź działanie aplikacji. Stwórz oddzielnego maina, a w nim kolejną listę integerów.
 */
public class Zadanie2 {
    private static final int ILOSC_LICZB = 10;

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < ILOSC_LICZB; i++) {
            lista.add(generator.nextInt(100));
        }
        System.out.println("Lista: " + lista);

        double suma = 0.0;
//        for (Integer wartosc : lista) {
//            suma += wartosc;
//        }
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        System.out.println("Suma liczb to: " + suma);
        System.out.println("Srednia liczb to: " + (suma / lista.size()));

        List<Integer> posortowaneLiczby = new ArrayList<>(lista);
        Collections.sort(posortowaneLiczby);

        System.out.println("Posortowane liczby = " + posortowaneLiczby);

        // Mediana =
        //  - środkowy element dla nieparzystych
        //  - średnia dwóch środkowych elementów dla parzystych
        double mediana;
        if (posortowaneLiczby.size() % 2 == 0) {
            // Parzyste 0 1 2 3 [4 5] 6 7 8 9
            int rozmiarListy = posortowaneLiczby.size();     // 10
            int indeksSrodkowegoElementu = rozmiarListy / 2; // 5 (a musimy zrobić sumę 4+5)

            int liczba1 = posortowaneLiczby.get(indeksSrodkowegoElementu);
            int liczba2 = posortowaneLiczby.get(indeksSrodkowegoElementu - 1);
            mediana = (liczba1 + liczba2) / 2.0;
        } else {
            // Nieparzyste 0 1 2 3 [4] 5 6 7 8
            int rozmiarListy = posortowaneLiczby.size();     // 9
            int indeksSrodkowegoElementu = rozmiarListy / 2; // 4

            mediana = posortowaneLiczby.get(indeksSrodkowegoElementu);
        }
        System.out.println("Mediana = " + mediana);

        System.out.println("Jeszcze raz lista której nie sortowaliśmy: " + lista);
        int najwieksza = lista.get(0);
        int najmniejsza = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > najwieksza) {
                najwieksza = lista.get(i);
            }
            if (lista.get(i) < najmniejsza) {
                najmniejsza = lista.get(i);
            }
        }
        System.out.println("Najwiekszy element: " + najwieksza);
        System.out.println("Najwiekszy element jest na pozycji: " + lista.indexOf(najwieksza));
        System.out.println("Najmniejszy element: " + najmniejsza);
        System.out.println("Najmniejszy element jest na pozycji: " + lista.indexOf(najmniejsza));

        int indeksNajwiekszej = 0;
        int indeksNajmniejszej = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == najwieksza) {
                indeksNajwiekszej = i;
            }
            if (lista.get(i) == najmniejsza) {
                indeksNajmniejszej = i;
            }
        }
        System.out.println("Najwiekszy element jest na pozycji: " + indeksNajwiekszej);
        System.out.println("Najmniejszy element jest na pozycji: " + indeksNajmniejszej);

    }
}
