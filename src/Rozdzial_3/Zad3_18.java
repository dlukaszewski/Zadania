package Rozdzial_3;

import java.util.Random;

public class Zad3_18 {
    public static void main(String[] args) {
        double min,max,liczba,i=1;
        double suma = 0;
        int iloscLiczb=5;


        Random r = new Random();
        min = Math.round(100*(r.nextDouble()));
        System.out.print("Wylosowano Liczby " + min + " , ");
        max = min;
        suma+=max;

        while (i<=iloscLiczb-1){
            liczba = Math.round(100*(r.nextDouble()));
            System.out.print(liczba + " , ");

            if (max <liczba){
                max = liczba;
            }
            if (min > liczba){
                min = liczba;
            }
            suma+=liczba;
            i++;
        }
        System.out.println();
        System.out.println("najwieksza liczba to " + max);
        System.out.println();
        System.out.println("najmniejsza liczba to " + min);
        System.out.println();
        System.out.println("Srednia wylosowanyc liczb to " + suma/iloscLiczb);



    }
}
