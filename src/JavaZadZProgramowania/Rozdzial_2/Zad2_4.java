package JavaZadZProgramowania.Rozdzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad2_4 {
    public static void main(String[] args)throws IOException {
        double a,b,c,x;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj Liczby do obliczenia wartosci x z rownania ax + b = c");
        System.out.println("Podaj liczbe a ");
        a =Double.parseDouble(reader.readLine());
        if (a ==0){
            System.out.println("Niedozwolona wartość liczba a nie moze byc rowna 0");
        }else {
            System.out.println("Podaj Liczbe b ");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Podaj Liczbe c ");
            c = Double.parseDouble(reader.readLine());
            x = (c - b) / a;
            System.out.println("Liczba x jest rowna ");
            System.out.printf("%3.2f",x);
        }
    }
}
