package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_15 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        System.out.println("Program sumuje liczby nie-parzyste od 1 do 100");

        while (x <=100){


            if (x%2 != 0){
                y+=x;
                System.out.println(y);
            }x++;

        }
        System.out.println("Suma liczb nie-parzystych z przedzialu od 1 do 100 jest rowna " + y);



    }
}
