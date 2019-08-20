package Rozdzial_6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Zad6_4 {
    double tablica[]={10.1,3.5,89.7,60.28,100.12,0.01};
    double d;
    public void zapis_do_pliku()throws IOException {

        RandomAccessFile file = new RandomAccessFile("numerki.txt", "rw");

        for (int i=0;i<tablica.length;i++){
            file.writeDouble(tablica[i]);
        }
        file.close();
    }
    public void odczyt_pliku () throws IOException{
        RandomAccessFile file = new RandomAccessFile("numerki.txt","r");

        for (int i=0; i< tablica.length;i+=2){
            file.seek(8*i);
            d=file.readDouble();
            System.out.println(d);
        }
        file.close();
    }

    public static void main(String[] args)throws IOException {
        Zad6_4 numerki = new Zad6_4();
        System.out.println("Program wyswietla co drugi numerek z wczesniej zapisanego pliku numerki.dat");
        numerki.zapis_do_pliku();
        numerki.odczyt_pliku();
    }
}
