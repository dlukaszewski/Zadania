package Rozdzial_4;

public class Zad4_2 {
    public static void main(String[] args) {

        int n= 10, i;

        int dane [] = new int[n];

        for (i = 0; i < dane.length; i++){
            dane [i] = n -1;
            System.out.println("index [" + i + "] ma wartosc rowna = " + dane[i]);
            n--;
        }


    }
}
