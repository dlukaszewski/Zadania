package Rozdzial_1;

import java.io.*;

public class Zad1_7 {
    public static void main(String[] args)throws IOException {

        float x ,y;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj Pierwsza liczbe : ");
        x = Float.parseFloat(reader.readLine());
        System.out.println("Podaj druga liczbe : ");
        y = Float.parseFloat(reader.readLine());
        float mnozenie = x * y;
        float dzielenie = x/y;
        float dodawanie = x+y;
        float odejmowanie = x-y;
        System.out.printf("%6.2f" ,mnozenie);
        System.out.printf("%6.2f" ,dzielenie);
        System.out.printf("%6.2f" ,dodawanie);
        System.out.printf("%6.2f" ,odejmowanie);

    }
}
