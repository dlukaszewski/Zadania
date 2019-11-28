package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_23 {
    public static void main(String[] args) {
        System.out.println("Program wyswietla litery od A do Z i od Z do A");
        char znak = 'A';

        do {
            System.out.print(znak + ",");
            znak++;

        }while(znak <'Z');
        System.out.println(znak);
        do {
            System.out.print(znak + ",");
            znak--;
        }while (znak>='A');
        System.out.println();
//Wersja kodu z ksiazki
        System.out.println("Program wyswietla litery od A do Z i od Z do A Wersja z ksiazki");
        znak = 'A';
        do {
            if(znak <'Z'){
                System.out.print(znak +",");
            }else{
                System.out.println(znak + ".");
            }znak++;
        }while(znak<='Z');
        znak = 'Z';
        do {
            if (znak >'A'){
                System.out.print(znak + ",");
            }else{
                System.out.println(znak + ".");
            }znak--;
        }while(znak >= 'A');




    }

}
