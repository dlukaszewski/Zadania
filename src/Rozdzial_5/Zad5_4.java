package Rozdzial_5;

public class Zad5_4 {
public void czytaj_dane(int [] liczby, int n){
    int i;
    liczby[0] = 57;
    liczby[1] = 303;
    liczby[2] = 34;
    liczby[3] = 1025;
    liczby[4] = 8;
    liczby[5] = 20;

    System.out.println("Liczby nie posortowane to : ");
    for (i=0;i<=5;i++){
        if (i< n -1){
            System.out.print(liczby[i] + " , ");
        } else {
            System.out.print(liczby[i] + " .");
        }
    }
    System.out.println();
}
public void przetworz_dane( int [] liczby, int n){
    int i, j, x;

    for (i = 1; i<= n-1; i++){
        for (j=1; j <= n-1; j++){
            if(liczby[j-1] > liczby[j]){
                x = liczby[j-1];
                liczby[j-1] = liczby[j];
                liczby[j] = x;
            }
        }
    }
}
public void wyswietl_dane(int [] liczby, int n){
    int i;
    System.out.println("Liczby Posortowane to : ");
    for (i=0;i<n ; i++){
        if (i < n-1){
            System.out.print(liczby[i] + " , ");
        }else{
            System.out.print(liczby[i] + " . ");
        }
    }
    System.out.println();
}

    public static void main(String[] args) {
    int n = 6;
    int [] liczby = new int [n];
        Zad5_4 sortowanie = new Zad5_4();

        sortowanie.czytaj_dane(liczby,n);
        sortowanie.przetworz_dane(liczby,n);
        sortowanie.wyswietl_dane(liczby,n);
    }
}
