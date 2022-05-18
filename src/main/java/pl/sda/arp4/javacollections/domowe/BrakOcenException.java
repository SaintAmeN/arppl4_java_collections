package pl.sda.arp4.javacollections.domowe;

public class BrakOcenException extends RuntimeException{
    public BrakOcenException() {
        super("Brak ocen do obliczenia średniej");
    }
}
