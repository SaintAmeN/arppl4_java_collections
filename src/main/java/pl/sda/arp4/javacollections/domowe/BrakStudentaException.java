package pl.sda.arp4.javacollections.domowe;

// Chcę żeby osoba która używa klasy Dziennik na pewno
//  obsłużyła sytuacje gdy nie znajdziemy wybranego studenta.
public class BrakStudentaException extends Exception {
    public BrakStudentaException(String numerIndeksu) {
        super("Nie znaleziono studenta o numerze indeksu: " + numerIndeksu);
    }
}
