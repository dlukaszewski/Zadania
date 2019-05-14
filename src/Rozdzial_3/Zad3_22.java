package Rozdzial_3;

public class Zad3_22 {
    public static void main(String[] args) {
//Moja Wersja

        System.out.println("Program wyswietla litery od A do Z i od Z do A");

        char znak;

        for (znak = 'A'; znak <='Z';znak++){
            System.out.print(znak + ",");
            if (znak == 'Z'){
                System.out.println();
                for (znak='Z';znak >='A';znak--){

                    System.out.print(znak + ",");
                }break;
            }
        }
        //Wrsja z ksiazki
        System.out.println();
        System.out.println("Program wyswietla litery od A do Z i od Z do A w wersji z ksiazki");
        for (znak = 'A'; znak <='Z';znak++){
            if (znak < 'Z'){
                System.out.print(znak + ",");
            }else {
                System.out.println(znak + ".");
            }

        }
        for (znak = 'Z'; znak >='A';znak--){
            if (znak >'A'){
                System.out.print(znak + ",");
            }else {
                System.out.println(znak + ".");
            }
        }



    }

}
