package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_3 {
    public static void main(String[] args) {


        System.out.println("Program Wypisuje wartosc funkcji y=3x dla x rownego od 0 do 10");
        int x = 0;
        int y;

        while(x<=10){
            y=3*x;
            System.out.println("Wartosc rownania y = 3x dla x=" + x + " jest rowna y=" + y);
            x++;

        }

    }
}
