package Rozdzial_6;

import java.io.*;

public class Zad6_1 {
    String dane, dane1;

    public void czytaj_dane() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie i nazwisko: ");
        dane = reader.readLine();
    }
    public void zapisz_dane_do_pliku() throws IOException{
        System.out.println("Zapisujemy dane do pliku dane.txt");
        FileWriter writer = new FileWriter("dane.txt");
        writer.write(dane);
        writer.close();

    }
    public void czytaj_dane_z_pliku() throws IOException{
        System.out.println("Odczytujemy dane z pliku dane.txt");
        System.out.println();
        FileReader reader = new FileReader("dane.txt");
        BufferedReader reader1= new BufferedReader(reader);

        while((dane1 = reader1.readLine()) != null){
            System.out.println(dane1);

        }
        reader.close();
    }

    public static void main(String[] args)throws IOException {
        Zad6_1 plik = new Zad6_1();
        plik.czytaj_dane();
        plik.zapisz_dane_do_pliku();
        plik.czytaj_dane_z_pliku();
    }
}
