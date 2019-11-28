package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_24 {
    public static void main(String[] args) {

        char znak;
        System.out.println("Program wyswietla Litery od A do Z i od Z do A");


        znak = 'A';
        while(znak <= 'Z'){
            System.out.print(znak + ",");
            znak++;
        }
        znak = 'Z';
        System.out.println();
        while(znak >='A'){
            System.out.print(znak + ",");
            znak--;
        }


    }
}
