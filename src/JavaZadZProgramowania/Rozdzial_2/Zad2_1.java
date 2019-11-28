package JavaZadZProgramowania.Rozdzial_2;

import java.io.*;

public class Zad2_1 {
    public static void main(String[] args) throws IOException {

        double a,b,c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj bok A ");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Podaj bok B ");
        b = Double.parseDouble(reader.readLine());
        System.out.println("Podaj bok C ");
        c = Double.parseDouble(reader.readLine());

        if (a*a+b*b == c*c){
            System.out.println("Podane boki");
            System.out.println("Bok a =  " + a);
            System.out.println("Bok b = " + b);
            System.out.println("Bok c = " + c);
            System.out.println("Tworza trojkat prostokatny");
        }
        else {
            System.out.println("Boki a b c nie tworza trojkata prostokatnego");
        }



    }
}
