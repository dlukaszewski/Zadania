package JavaZadZProgramowania.Rozdzial_3;

import java.io.IOException;
import java.util.Random;

public class Zad3_16 {
    public static void main(String[] args) throws IOException {
        double min,max;
        int ilośćLiczb = 5;
        double suma=0,liczba;

            Random r = new Random();
            min = Math.round(100*(r.nextDouble()));

        System.out.print("Wylosowano liczby " + min +" , " );
        max=min;

        suma+=max;



            for(int i = 0; i<ilośćLiczb;i++){
                liczba = Math.round(100*(r.nextDouble()));
                System.out.print(liczba + " ,");



                if (max <liczba){
                    max = liczba;
                }
                if (min<liczba){
                    min =liczba;
                }
                suma+=liczba;
            }

            System.out.println();
            System.out.println("najwieksza liczba to " + max);
            System.out.println();
            System.out.println("najmniejsza liczba to " + min);
            System.out.println();
            System.out.println("Srednia wylosowanyc liczb to " + suma/ilośćLiczb);

    }

}

