package Rozdzial_3;

public class Zad3_20 {
    public static void main(String[] args) {

        int n = 10;

        int wiersze =1 ,kolumny;

        do {
            kolumny = 1;
            do{
                System.out.print(wiersze*kolumny + "\t");
                kolumny++;
            }while (kolumny <= n);
            wiersze++;
            System.out.println();
            }while (wiersze<=n);


    }
}
