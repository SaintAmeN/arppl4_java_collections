package pl.sda.arp4.javacollections.domowe;


import org.junit.Test;

public class StudentTest {

    @Test
    public void testSredniej(){
        Student student = new Student("test", "test", "test");
        double wynik = student.obliczSrednia(); // NaN
        System.out.println(wynik);
    }
}