package ThinikingInJava.Rozdzial_3;

import java.util.Random;

public class Zad3_7 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.println("WYNIK");
        System.out.println(flip ? "ORZEL" : "RESZKA");
    }
}
