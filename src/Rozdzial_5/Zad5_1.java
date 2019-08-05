package Rozdzial_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Zad5_1 {


    private double a ,b,pole;


    private void  czytaj_dane () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program cblicza pole prostokata");
        System.out.println("Podaj parametr a ");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Podaj parametr b ");
        b = Double.parseDouble(reader.readLine());

    }
    private void przetworz_dane(){
        pole = a * b;
    }
    private void wyswietlWynik() {
        System.out.println("Pole prostokata wynosi ");
        System.out.printf("%2.2f.\n", pole);
    }
    public static void main(String[] args) throws IOException {
        Zad5_1 pole1 = new Zad5_1();
        pole1.czytaj_dane();
        pole1.przetworz_dane();
        pole1.wyswietlWynik();
    }
}
