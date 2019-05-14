package Rozdzial_3;

public class Zad3_19 {
    public static void main(String[] args) {
        System.out.println("Program wyswietla tabliczke mnozenia dla liczb od 1 do 100");

        int n = 10;
        int wiersze, kolumny;

        for(wiersze = 1; wiersze <=n;wiersze++ ){

            for (kolumny= 1 ;kolumny<=n;kolumny++){
                System.out.print(kolumny*wiersze + "\t");
            }
            System.out.println();
        }
    }
}
