package JavaZadZProgramowania.Rozdzial_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad4_14 {
    public static void main(String[] args)throws IOException {


        String lancuch1,lancuch2;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Program laczy ze soba dwa podane lancuchy znakow ");
        System.out.println("Podaj pierwszy ciag znakow ");
        lancuch1 = bufferedReader.readLine();
        System.out.println("Podaj Drugi ciag znakow ");
        lancuch2 = bufferedReader.readLine();

        System.out.println("Polaczone lancuchy znakow to " + lancuch1 + lancuch2);
        System.out.println("Polaczone lancuchy znakow to " + lancuch2 + lancuch1);
        System.out.println("odworcone polaczenie jest niezrozumiale znaczy to ze konkatencja tzn laczenie znakow nie jest przemienne");
    }
}
