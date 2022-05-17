package pl.sda.arp4.javacollections;

import java.util.*;

public class MainListaString {
    public static void main(String[] args) {
        // czytamy: List of Strings
        //          Lista Stringów
        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String element;
        do {
            System.out.println("Wpisz kolejny element, lub wpisz 'quit' aby zakończyć:");
            element = scanner.next();

            if (!element.equals("quit")) {
                lista.add(element);
            }
        } while (!element.equals("quit"));
//        lista.remove("quit");

        System.out.println("Wpisane elementy:");
        System.out.println(lista);

        System.out.println("Wpisz element do znalezienia:");
        String szukanyElement = scanner.next();

        int indeksSzukanegoElementu = lista.indexOf(szukanyElement);
        System.out.println("Znaleziono na indeksie: " + indeksSzukanegoElementu);

        // [ala, ma, kota, a, kot, ma, ale, gdzies]
        // kota = 2
        // ma = 1
        // placki = -1

        boolean czyZnaleziono = lista.contains(szukanyElement);
        System.out.println("Czy lista contains szukany element: " + czyZnaleziono);

        // sprawdzenie czy lista jest pusta
//        Opcja 1:
//        boolean wynikIsEmpty = lista.isEmpty();
//        System.out.println("Czy lista jest pusta: " + wynikIsEmpty);

//        Opcja 2:
        System.out.println("Czy lista jest pusta: " + lista.isEmpty());

        System.out.println("Rozmiar listy wynosi: " + lista.size());

//        Czyszczenie listy (usuwa wszystkie elementy):
//        lista.clear();

        // skopiowanie listy
        List<String> kopia = new ArrayList<>(lista); // < - tutaj kopiujemy listę
//        List<String> kopia = lista; <- tutaj nie kopiujemy listy, no bueno, źle, be-be

        // Sortowanie listy:
        Collections.sort(lista);

        // lista -> jest posortowana
        // kopia -> nie jest posortowana
    }
}
