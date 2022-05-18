package pl.sda.arp4.javacollections.domowe;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStudenta() {
        Dziennik dziennik = new Dziennik();

        // testujemy przypadek w którym nie ma studenta
        try {
            Student s = dziennik.zwrocStudenta("123");
        } catch (BrakStudentaException e) {
            System.out.println("Nie znaleziono studenta");
        }
    }

    @Test
    public void test_zwrocStudentaNull() {
//        Dziennik dziennik = new Dziennik();
//        Student s = dziennik.zwrocStudentaNull("123");
//
//        double srednia = s.obliczSrednia();
//
//        if (s == null) {
//            System.out.println("Nie znaleziono studenta");
//        } else {
//            System.out.println(s.getNumerIndeksu()); // Null pointer exception
//        }
    }
}