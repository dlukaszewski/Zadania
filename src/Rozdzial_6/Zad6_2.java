package Rozdzial_6;



import java.io.*;

public class Zad6_2 {
    int rozmiar = 10;
    public void czytaj_dane(int tablica [][], int rozmiar){
        int i, j;
        System.out.println("tworzymy tablice 10x10");
        for (i=0;i<rozmiar;i++){
            for (j=0;j<rozmiar;j++){
                if (i== j){
                    tablica[i][j] = 1;
                }else {
                    tablica[i][j] = 0;
                }
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void zapisz_dane(int tablica[][], int rozmiar) throws IOException {
        int i, j;
        System.out.println();
        System.out.println("zapisujemy tablice 10x10 do pliku tablica.txt");
        FileWriter writer = new FileWriter("tablica.txt");
        for (i=0;i<rozmiar;i++){
            for (j=0;j<rozmiar;j++){
                writer.write((char)(tablica[i][j]));
                System.out.print(tablica[i][j]+ " ");
            }
            System.out.println();
        }
        writer.close();
    }
    public void czytaj_dane_z_pliku(int tablica1[][], int rozmiar)throws IOException{
        int i, j;
        System.out.println();
        System.out.println("czytamy tablice 10x10 z pliku tablica.txt");
        FileReader reader = new FileReader("tablica.txt");
        BufferedReader reader1 = new BufferedReader(reader);
        for (i=0;i<rozmiar;i++){
            for (j=0;j<rozmiar;j++){
                tablica1[i][j] = (int) reader1.read();

                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
        reader1.close();
    }

    public static void main(String[] args) throws IOException{

        int rozmiar = 10;
        int tab[][] = new int[rozmiar][rozmiar];
        int tab1[][] = new int[rozmiar][rozmiar];


        Zad6_2 plik_z_tablica = new Zad6_2();
        plik_z_tablica.czytaj_dane(tab,rozmiar);
        plik_z_tablica.zapisz_dane(tab,rozmiar);
        plik_z_tablica.czytaj_dane_z_pliku(tab1,rozmiar);

    }

}
