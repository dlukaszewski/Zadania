package Rozdzial_3;

public class Zad3_12 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        System.out.println("Program sumuje liczby parzyste od 1 do 100");

        while (x <=100){
            x++;

            if (x%2 == 0){
                y+=x;
                System.out.println(y);
            }

        }
        System.out.println("Suma liczb parzystych z przedzialu od 1 do 100 jest rowna " + y);



    }
}
