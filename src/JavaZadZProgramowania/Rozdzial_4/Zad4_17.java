package JavaZadZProgramowania.Rozdzial_4;

import java.util.ArrayList;
import java.util.Collections;

public class Zad4_17 {
    public static void main(String[] args) {


        ArrayList lista = new ArrayList();
        lista.add(20);
        lista.add(51);
        lista.add(-72);
        lista.add(4);
        lista.add(14);
        lista.add(-4);

        System.out.println("Elementy nie posortowane ");

        for (int i = 0 ;i<lista.size();i++){
            if (i<lista.size()-1){
                System.out.print(lista.get(i) + ", ");
            }else{
                System.out.print(lista.get(i) +". ");
            }

        }
        System.out.println();
        System.out.println("Posortowana lista ");
        Collections.sort(lista);
        for (int i = 0 ;i<lista.size();i++){
            if (i<lista.size()-1){
                System.out.print(lista.get(i) + ", ");
            }else{
                System.out.print(lista.get(i) +". ");
            }

        }
        System.out.println();
        lista.remove(1);
        System.out.println("Usunieto drugi element listy i dodano nowy");
        lista.add(10);


        System.out.println("Nowa lista nie posortowana");
        for (int i = 0 ;i<lista.size();i++){
            if (i<lista.size()-1){
                System.out.print(lista.get(i) + ", ");
            }else{
                System.out.print(lista.get(i) +". ");
            }

        }
        System.out.println();
        System.out.println("Now lista posortowana ");
        Collections.sort(lista);
        for (int i = 0 ;i<lista.size();i++){
            if (i<lista.size()-1){
                System.out.print(lista.get(i) + ", ");
            }else{
                System.out.print(lista.get(i) +". ");
            }

        }
        System.out.println();


    }
}
