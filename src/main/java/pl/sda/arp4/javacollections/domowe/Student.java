package pl.sda.arp4.javacollections.domowe;

import java.util.ArrayList;
import java.util.List;

/**
 * * Student powinna:
 * *     - posiadać listę ocen studenta (List<Double>)
 * *     - posiadać (pole) numer indeksu studenta (String)
 * *     - posiadać (pole) imię studenta
 * *     - posiadać (pole) nazwisko studenta
 */
public class Student {
    // linia przypisania poniżej działa tak samo jak przypisanie w konstruktorze (linia 25)
    private List<Double> listaOcen = new ArrayList<>();
    private String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(String numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;

        this.listaOcen = new ArrayList<>();
    }

    public double obliczSrednia() {
        if (listaOcen.isEmpty()) {
            throw new BrakOcenException();
        }

        double suma = 0.0;
        for (int i = 0; i < listaOcen.size(); i++) {
            suma += listaOcen.get(i);
        }

        return (suma / listaOcen.size());
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
