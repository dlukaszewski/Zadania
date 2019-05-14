package Rozdzial_3;

public class Zad3_13 {
    public static void main(String[] args) {
        int y = 0;
        System.out.println("Program sumuje liczby nie-parzyste od 1 do 100");

        for (int x=0;x<=100;x++){

            if (x%2!=0){
                y+=x;
                System.out.println(y);
            }

        }
        System.out.println("Suma liczb nie-parzystych z przedzialu od 1 do 100 jest rowna " + y);

    }
}
