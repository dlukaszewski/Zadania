package Rozdzial_5;

public class Zad5_7 {
    public int fibonacci (int n){
        switch (n){
            case 0 : return 0;
            case 1 : return 1;
            default : return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
    int i, n = 10;
    Zad5_7 fib = new Zad5_7();
        System.out.println("Program znajduje rekurencyjnie " + n + " pierwszych liczb ciagu Fibonacciego ");
        System.out.println();
        for (i=0; i<=n;i++){
            System.out.println(fib.fibonacci(i) + " ");
        }
    }
}
