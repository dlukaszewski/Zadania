package Rozdzial_4;

import java.util.ArrayList;
import java.util.Collections;

public class Zad4_18 {
    public static void main(String[] args) {

        ArrayList listaImion = new ArrayList();

        listaImion.add("Damian");
        listaImion.add("Maja");
        listaImion.add("Andrzej");
        listaImion.add("Piotr");
        listaImion.add("Natalia");
        listaImion.add("Franek");

        System.out.println("Lista imion w kolekcji ");
        for (int i = 0; i < listaImion.size(); i++){
            if (i <listaImion.size()-1){
                System.out.print(listaImion.get(i) + ", ");
            }else{
                System.out.print(listaImion.get(i)+ ". ");
            }
        }
        System.out.println();
        System.out.println("Lista imion posortowanych");
        Collections.sort(listaImion);

        for (int i = 0; i < listaImion.size(); i++){
            if (i <listaImion.size()-1){
                System.out.print(listaImion.get(i) + ", ");
            }else{
                System.out.print(listaImion.get(i)+ ". ");
            }
        }
        System.out.println();
        System.out.println("Usunieto dwa imiona z listy");
        System.out.println("oraz dodano dwa nowe imiona do listy");
        System.out.println("Nowa lista imion nie posortowana");
        listaImion.remove("Piotr");
        listaImion.remove("Natalia");
        listaImion.add("Mateusz");
        listaImion.add("Karolina");
        for (int i = 0; i < listaImion.size(); i++){
            if (i <listaImion.size()-1){
                System.out.print(listaImion.get(i) + ", ");
            }else{
                System.out.print(listaImion.get(i)+ ". ");
            }
        }
        System.out.println();
        Collections.sort(listaImion);
        System.out.println("Nowa lista imion Posortowana");
        for (int i = 0; i < listaImion.size(); i++){
            if (i <listaImion.size()-1){
                System.out.print(listaImion.get(i) + ", ");
            }else{
                System.out.print(listaImion.get(i)+ ". ");
            }
        }
        System.out.println();




    }
}
