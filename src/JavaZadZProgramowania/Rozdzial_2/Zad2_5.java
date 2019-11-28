package JavaZadZProgramowania.Rozdzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Zad2_5 {
    public static void main(String[] args)throws IOException {

        double losujLiczbe,zgadnijLiczbe;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program Losuje liczbe z przedzialu od 0 do 9 zgaduj te liczbe");
        Random r = new Random();
        losujLiczbe = Math.round(10*(r.nextDouble()));
        zgadnijLiczbe = Double.parseDouble(reader.readLine());

        if (losujLiczbe == zgadnijLiczbe){
            System.out.println("gratuluje zgadles wylosowana liczbe ");
        } else {
            System.out.println("niestety nie trafiles wylosowana liczba to " + losujLiczbe);
        }
    }
}
