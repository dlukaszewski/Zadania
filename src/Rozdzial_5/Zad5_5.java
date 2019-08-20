package Rozdzial_5;

import Rozdzial_1.Zad1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_5 {
    public long silnia(int liczba){
        long zwrot = 1;
        if (liczba >= 2){
            zwrot = liczba * silnia(liczba -1);
        }
        return zwrot;
    }

    public static void main(String[] args) throws IOException {
        int i, n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Zad5_5 silnia1 = new Zad5_5();
        System.out.println("Obliczanie silni danej Liczby");
        System.out.println("Podaj n ");
        n = Integer.parseInt(br.readLine());
        for (i = 1; i <= n; i++) {
            System.out.println(i + "! = " + silnia1.silnia(i));
        }
    }
}
