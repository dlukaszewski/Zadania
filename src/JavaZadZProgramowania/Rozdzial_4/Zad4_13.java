package JavaZadZProgramowania.Rozdzial_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad4_13 {
    public static void main(String[] args) throws IOException {

        String imie,nazwisko;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Program Mierzy dlugosc lancucha znakow imie i nazwisko");
        System.out.println("Podaj Imie ");
        imie = bufferedReader.readLine();
        System.out.println("Podaj Nazwisko ");
        nazwisko = bufferedReader.readLine();
        System.out.println("Podane imie ma " + imie.length() + " znaki");
        System.out.println("Natomaist podane nazwisko ma : " + nazwisko.length() + " znaków");
    }
}
