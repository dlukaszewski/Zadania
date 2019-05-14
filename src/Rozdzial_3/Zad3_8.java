package Rozdzial_3;

public class Zad3_8 {
    public static void main(String[] args) {


        int y = 0;
        int x = 1;
        System.out.println("Program sumuje liczby calkowite od 1 do 100");

        do {
            y+=x;
            x++;
        } while(x <=100);
        System.out.println("Suma liczb od 1 do 100 to "+ y);

    }
}
