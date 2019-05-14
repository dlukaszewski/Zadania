package Rozdzial_3;

public class Zad3_1 {
    public static void main(String[] args) {
        System.out.println("Program Wypisuje wartosc funkcji y=3x dla x rownego od 0 do 10");
        int y= 0;
        for (int x =0 ; x <=10;x++ ){
            y = 3*x;
            System.out.println("Wartosc rownania y = 3x dla x=" + x + " jest rowna y=" + y);
        }
    }
}
