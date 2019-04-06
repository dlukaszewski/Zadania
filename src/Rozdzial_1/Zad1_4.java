package Rozdzial_1;\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;


public class Zad1_4 {
    public static void main(String[] args) throws IOException {

        double r;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj Promien Kuli : ");
        r = Double.parseDouble(reader.readLine());

        System.out.printf("Objetosc Kuli wynosi" + "%6.2f\n",4* pow(r,2)*Math.PI / 3 );






    }
}
