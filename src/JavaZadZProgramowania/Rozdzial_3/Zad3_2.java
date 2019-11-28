package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_2 {
    public static void main(String[] args) {


        int x = 0;
        int y;
        System.out.println("Program Wypisuje wartosc funkcji y=3x dla x rownego od 0 do 10");
        do {
            y = 3*x;
            System.out.println("Wartosc rownania y = 3x dla x=" + x + " jest rowna y=" + y);
            x++;


        }while (x<=10);
    }
}
