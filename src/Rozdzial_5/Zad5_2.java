package Rozdzial_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_2 {
    double a,b,c,x1,x0,delta;
    char liczba_pierwiastkow;

    public void czytaj_dane() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wartosc a : ");
        a = Double.parseDouble(reader.readLine());
        if (a <= 0){
            System.out.println("Niedozwolona wartosc dla a");
            System.exit(1);
        }else{
            System.out.println("Podaj wartosc b : ");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Podaj wartosc c : ");
            c = Double.parseDouble(reader.readLine());
        }
    }
    public void przetworz_dane(){
        delta = (b*b) - 4 * a * c;
        if(delta < 0){
            liczba_pierwiastkow = 0;
        }
        if(delta == 0){
            liczba_pierwiastkow = 1;
        }
        if(delta > 0){
            liczba_pierwiastkow = 2;
        }
        switch (liczba_pierwiastkow){
            case 1: x1 = (-b / (2*a));
            break;
            case 2: {
                x0 = (-b - Math.sqrt(delta))/(2*a);
                x1 = (-b + Math.sqrt(delta))/(2*a);
            }break;
        }
    }
    public void wyswietl_dane(){
        System.out.println("Dla wprowadzonych Liczb ");
        System.out.printf("a = " +"%2.2f\n", a);
        System.out.printf("b = " +"%2.2f\n", b);
        System.out.printf("c = " +"%2.2f\n", c);

        switch (liczba_pierwiastkow){
            case 0:
                System.out.println("Brak Pierwiastkow rzeczywistych");
                break;
            case 1:
                System.out.println("Jeden pierwiastek rzeczywisty ");
                System.out.printf("Wynik = " + "%2.2f,\n", x1);
                break;
            case 2:
                System.out.println("Dwa pierwiastki rzeczywiste ");
                System.out.printf("Wynik x0 = " +"%2.2f\n,", x0);
                System.out.printf("Wynik x1 = " +"%2.2f,", x1);
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Zad5_2 trojmian = new Zad5_2();
        trojmian.czytaj_dane();
        trojmian.przetworz_dane();
        trojmian.wyswietl_dane();
    }

}
