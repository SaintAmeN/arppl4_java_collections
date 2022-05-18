package pl.sda.arp4.javacollections.domowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * * Klasa Dziennik powinna:
 * - posiadać (jako pole) listę Studentów.
 * posiadać metodę:
 * - 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
 * - 'usuńStudenta(Student):void' do usuwania studenta
 * - 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
 * - 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
 * - 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
 * - 'podajStudentówZagrożonych():List<Student>'
 * - 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */
public class Dziennik {
    private List<Student> lista = new ArrayList<>();

    public void dodajStudenta(Student student) {
        lista.add(student);
    }

    public void usunStudenta(Student student) {
        lista.remove(student);
    }

    public void usunStudenta(String numerIndeksu) {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                System.out.println("Usuwam studenta.");
                lista.remove(sprawdzanyStudentI);   // usun studenta przekazując obiekt studenta do usuniecia
//                lista.remove(i);                  // usun studenta pod numerem indeksu na liście
                return;
            }
        }

        System.out.println("Nie znaleziono studenta.");
    }

    public Student zwrocStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                return sprawdzanyStudentI;
            }
        }

        throw new BrakStudentaException(numerIndeksu);
    }

    public double podajŚredniąStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
                double srednia = sprawdzanyStudentI.obliczSrednia();
                return srednia;
            }
        }

        throw new BrakStudentaException(numerIndeksu);
    }

    public void wypisz() {
        System.out.println("Lista studentów:");
        // każdy student wypisze się jeden pod drugim
//        System.out.println(lista);                    // w jednej linii
        for (Student student : lista) {                 // w oddzielnych liniach
            System.out.println(student);
        }
    }

//    public Student zwrocStudentaNull(String numerIndeksu) {
//        for (int i = 0; i < lista.size(); i++) {
//            Student sprawdzanyStudentI = lista.get(i);
//            String numerIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();
//
//            if (numerIndeksuStudentaI.equals(numerIndeksu)) {
//                return sprawdzanyStudentI;
//            }
//        }
//
//        return null;
//    }

}
