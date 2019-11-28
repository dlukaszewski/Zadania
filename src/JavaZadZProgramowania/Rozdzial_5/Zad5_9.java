package JavaZadZProgramowania.Rozdzial_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_9 extends Zad5_8 {
    String wyksztalcenie;
    String stanowisko;
    public void inicjuj1()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inicjuj();
        System.out.println("Podaj swoje wyksztalcenie ");
        wyksztalcenie = reader.readLine();
        System.out.println("Podaj swoje stanowisko ");
        stanowisko = reader.readLine();
    }
    public void drukuj1(){
        drukuj();
        System.out.println("Wyksztalcenie: " + wyksztalcenie);
        System.out.println("Stanowisko: " + stanowisko);
    }

    public static void main(String[] args) throws IOException {
        Zad5_9 inzynier = new Zad5_9();
        inzynier.inicjuj1();
        inzynier.drukuj1();
    }
}
