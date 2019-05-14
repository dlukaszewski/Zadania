package Rozdzial_3;

public class Zad3_14 {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby nie-parzyste od 1 do 100");

        int y = 0;
        int x = 0;
        do {



            if (x%2 != 0){
                y+=x;
                System.out.println(y);
            }x++;



        }while (x<=100);

        System.out.println("Suma liczb nie-parzystych z przedzialu od 1 do 100 jest rowna " + y);


    }
}
