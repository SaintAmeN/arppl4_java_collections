package pl.sda.arp4.javacollections.domowe;

import java.util.Scanner;

/**
 * Stwórz aplikację, a w niej klasę Dziennik i Student. Stwórz również klasę Student. Klasa
 * Student powinna:
 * - posiadać listę ocen studenta (List<Double>)
 * - posiadać (pole) numer indeksu studenta (String)
 * - posiadać (pole) imię studenta
 * - posiadać (pole) nazwisko studenta
 * <p>
 * Klasa Dziennik powinna:
 * - posiadać (jako pole) listę Studentów.
 * - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
 * - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
 * - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
 * - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
 * - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
 * - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
 * - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dziennik dziennik = new Dziennik();

        System.out.println("Tu dziennik elektroniczny, napisz co chcesz zrobić (dodaj, usun, wypisz):");
        String komenda;
        do {
            System.out.println("Podaj komende");
            komenda = scanner.next();

            if (komenda.equals("dodaj")) {
                System.out.println("Podaj imie:");
                String imie = scanner.next();

                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.next();

                System.out.println("Podaj numer indeksu:");
                String numerIndeksu = scanner.next();

                Student nowyStudent = new Student(numerIndeksu, imie, nazwisko);
                dziennik.dodajStudenta(nowyStudent);
            } else if (komenda.equals("wypisz")) {
                dziennik.wypisz();
            } else if (komenda.equals("usun")) {
                System.out.println("Podaj numer indeksu:");
                String idx = scanner.next();

                dziennik.usunStudenta(idx);
            } else if (komenda.equals("zwroc")) {
                System.out.println("Podaj numer indeksu:");
                String idx = scanner.next();

                try {
                    Student student = dziennik.zwrocStudenta(idx);
                    System.out.println(student);
                } catch (BrakStudentaException e) {
                    System.err.println("Nie znaleziono studenta");
                }
            } else {
                System.err.println("Podana komenda nie istnieje");
            }

            // dopóki ktoś nie wpisze 'koniec'
        } while (!komenda.equalsIgnoreCase("koniec"));
    }
}
