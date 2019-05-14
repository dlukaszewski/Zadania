package Rozdzial_3;

public class Zad3_11 {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby parzyste od 1 do 100");

        int y = 0;
        int x = 0;
        do {


            x++;
            if (x%2 == 0){
                y+=x;
                System.out.println(y);
            }



        }while (x<=100);

        System.out.println("Suma liczb parzystych z przedzialu od 1 do 100 jest rowna " + y);


    }
}
