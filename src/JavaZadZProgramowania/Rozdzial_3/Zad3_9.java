package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_9 {
    public static void main(String[] args) {

        int x = 0;
        int y= 0;
        System.out.println("Program sumuje liczby calkowite od 1 do 100");
        while(x<=100){
            y+=x;
            x++;
        }
        System.out.println("Suma liczb od 1 do 100 to "+ y);
    }
}
