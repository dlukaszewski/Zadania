package Rozdzial_4;

public class Zad4_12 {
    public static void main(String[] args) {

        int [] liczby = new int [6];

        int x,i,j;

        liczby[0] = 574;
        liczby[1] = 303;
        liczby[2] = 34;
        liczby[3] = 125;
        liczby[4] = 8;
        liczby[5] = 23;

        System.out.println("Dla Liczb: ");

        for (i = 0; i <=5;i++){
            if (i<=4){
                System.out.print(liczby[i] + " , ");
            }else{
                System.out.print(liczby[i] +" . ");
            }
        }
        System.out.println();

        for (i = 1; i <=5;i++){
            for (j = 5;j>=i;j--){
                if (liczby[j-1]>liczby[j]){
                    x = liczby[j-1];
                    liczby[j-1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
        System.out.println();
        System.out.println("Liczby uporzadkowane to : ");

        for (i=0;i<=5;i++){
            if (i<=4){
                System.out.print(liczby[i] + ", ");
            }else{
                System.out.print(liczby[i] + ". ");
            }

        }





    }

}
