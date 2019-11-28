package JavaZadZProgramowania.Rozdzial_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1_1 {


    public static void main(String[] args)
            throws IOException
    {

        double a,b,pole;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj bok a :");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Podaj bok b :");
        b = Double.parseDouble(reader.readLine());

        pole = a*b;

        System.out.println("Pole prostokata podanych bokow jest rowne " + pole);

    }
}
