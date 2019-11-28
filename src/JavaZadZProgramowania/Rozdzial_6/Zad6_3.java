package JavaZadZProgramowania.Rozdzial_6;

import java.io.*;

public class Zad6_3 {

    int n = 10;

    int a [][] =new int[n][n];
    int b [][] =new int[n][n];
    int c [][] =new int[n][n];

    public void czytaj_dane(){
        int i, j;

        System.out.println("Tworzymy tablice a");
        for (i=0;i<n;i++){
            for (j=0; j<n;j++){
                if (i == 1){
                    a[i][j]=1;
                }else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void przetworz_dane(){
        System.out.println();
        System.out.println("Przepisujemy zawrtosc tablicy a do tablicy b");
        int i,j;

        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
                b[i][j] = a[j][i];
            }
        }
    }
    public void zapisz_dane_do_pliku() throws IOException {
        int i, j;

        System.out.println("zapisujemy tablice b do pliku tablica.txt");
        FileWriter writer = new FileWriter("tablica1.txt");

        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                writer.write((char)(b[i][j]));

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        writer.close();
    }

    public void czytaj_dane_z_pliku()throws IOException{
        int i,j;
        System.out.println();
        System.out.println("Wczytujemy tablice z pliku tablica1.txt i umieszczamy w tablicy c");
        FileReader reader = new FileReader("tablica1.txt");
        BufferedReader reader1 = new BufferedReader(reader);

        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                c[i][j] = (int) reader1.read();
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        reader1.close();
    }

    public static void main(String[] args) throws IOException {

        Zad6_3 tablica = new Zad6_3();
        tablica.czytaj_dane();
        tablica.przetworz_dane();
        tablica.zapisz_dane_do_pliku();
        tablica.czytaj_dane_z_pliku();
    }

}
