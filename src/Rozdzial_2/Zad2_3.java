package Rozdzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Zad2_3 {
    public static void main(String[] args)throws IOException {

        double a,b,c,delta,x1,x2;
        char liczba_pierwiastkow = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj 3 Liczby do funkcji kwadratowej");
        System.out.println("Podaj Liczbe a");
        a = Double.parseDouble(reader.readLine());
        if (a==0){
            System.out.println("Niedozwolona wartość liczba a nie moze miec wartosci rownej 0 ");
        } else {
            System.out.println("Podaj liczbe b ");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Podaj Liczbe c ");
            c = Double.parseDouble(reader.readLine());
            delta = (b * b) - 4 * a * c;

            if (delta < 0 ){
                liczba_pierwiastkow = 0;
            }
            else if (delta == 0){
                liczba_pierwiastkow = 1;
            }
            else if (delta > 0){
                liczba_pierwiastkow = 2;
            }
            switch (liczba_pierwiastkow){
                case 0 :
                    System.out.println("Delta jest mnijsza od 0 Brak pierwiatkow");
                    break;
                case 1 :
                    x1 = (-b) / (2 * a);
                    System.out.println("Mamy jeden pierwiastek");
                    System.out.print("x1 = ");
                    System.out.printf("%3.2f",x1);
                    break;
                case 2 :
                    x1 = (-b) + sqrt(delta) / (2 * a);
                    x2 = (-b) - sqrt(delta) / (2 * a);
                    System.out.println("Mamy dwa miejsca zerowe ");
                    System.out.print("x1 = ");
                    System.out.printf("%3.2f",x1);
                    System.out.println("");
                    System.out.println("Oraz");
                    System.out.print("x2 = ");
                    System.out.printf("%3.2f",x2);
                    break;
            }

        }

    }
}
