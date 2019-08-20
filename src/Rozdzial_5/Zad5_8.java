package Rozdzial_5;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_8 {
    String nazwisko;
    String imie;
    String ulica;
    String kod;
    String miasto;

    public void inicjuj()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj swoje Nazwisko");
        nazwisko = reader.readLine();
        System.out.println("Podaj swoje Imie");
        imie = reader.readLine();
        System.out.println("Podaj ulice na ktorej mieszkasz");
        ulica = reader.readLine();
        System.out.println("Podaj swoj kod pocztowy");
        kod = reader.readLine();
        System.out.println("Podaj miasto w ktorm mieszkasz");
        miasto = reader.readLine();
        System.out.println();
    }
    public void drukuj() {
        System.out.println("Wyswietlanie danych");
        System.out.println("===================");
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Imie: " + imie);
        System.out.println("Zamieszkly przy ul: " + ulica);
        System.out.println("Kod pocztowy: " + kod);
        System.out.println("Miasto: " + miasto);
    }

    public static void main(String[] args) throws IOException {
        Zad5_8 pracownik = new Zad5_8();
        pracownik.inicjuj();
        pracownik.drukuj();
    }
}
