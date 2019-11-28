package JavaZadZProgramowania.Rozdzial_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_1_Powtorka {
    double a,b,pole;
    public void czytaj_dane() throws IOException {
        System.out.println("Podaj Boki prostokata");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj Bok a : ");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Podaj Bok b : ");
        b = Double.parseDouble(reader.readLine());
    }
    public void przetworz_dane(){
        pole = a * b ;
    }
    public void wyswietl_wynik(){
        System.out.println("Wynik pola prostokata to :" + pole);
    }

    public static void main(String[] args) throws IOException {
        Zad5_1_Powtorka pole = new Zad5_1_Powtorka();
        pole.czytaj_dane();
        pole.przetworz_dane();
        pole.wyswietl_wynik();
    }

}
