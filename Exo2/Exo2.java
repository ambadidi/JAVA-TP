import java.io.*;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer une valeur entiere: ");
        n = scan.nextInt();
        System.out.println("La somme des "+n+" premiers nombres entiers positifs est "+Sum(n));
        System.out.println("La somme des "+n+" premiers nombres entiers positifs paires est "+SumP(n));
    }
    public static int Sum(int x) {
        int i;
        int res;

        res = 0;
        i = 0;
        while (i <= x) {
            res = res + i;
            i++;
        }
        return (res);
    }
    public static int SumP(int x) {
        int i;
        int res;

        res = 0;
        i = 0;
        while (i <= x) {
            res = res + i;
            i = i + 2;
        }
        return (res);
    }
}