package JavaZadZProgramowania.Rozdzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Zad2_2 {
    public static void main(String[] args) throws IOException {

        double a,b,c,delta,x1,x2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj 3 Liczby do funkcji kwadratowej");
        System.out.println("Podaj Liczbe a");
        a = Double.parseDouble(reader.readLine());
        if (a==0) {
            System.out.println("Niedozwolona wartość liczba a nie moze miec wartosci rownej 0 ");
        }else {
            System.out.println("Liczba a = " + a);
            System.out.println("Podaj Liczbe b");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Liczba b = " + b);
            System.out.println("Podaj Liczbe c");
            c = Double.parseDouble(reader.readLine());
            System.out.println("Liczba c = " + c);

            delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Brak miejsc Zerowych");
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("Mamy jedno miejsce zerowe ");
                System.out.print("x1 = ");
                System.out.printf("%3.2f",x1);
            } else if (delta > 0) {
                x1 = (-b) + sqrt(delta) / (2 * a);
                x2 = (-b) - sqrt(delta) / (2 * a);
                System.out.println("Mamy dwa miejsca zerowe ");
                System.out.print("x1 = ");
                System.out.printf("%3.2f", x1);
                System.out.println();
                System.out.println("Oraz");
                System.out.print("x2 = ");
                System.out.printf("%3.2f", x2);
            }
        }
    }
}
