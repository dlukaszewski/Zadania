package Rozdzial_3;

public class Zad3_21 {
    public static void main(String[] args) {

        int n = 10;
        int kolumny,wiersze;

        wiersze = 1;

        while (wiersze <=n){
            kolumny = 1;
            while (kolumny<=n){

                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }

    }
}
