import java.io.*;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer une valeur entiere: ");
        n = scan.nextInt();
        System.out.println("La somme des carrees des "+n+" premiers nombres entiers est "+SumSquare(n));
        System.out.println("Le factoriel de "+n+" est "+Factorial(n));
    }
    public static int SumSquare(int x) {
        int i;
        int res;

        i = 1;
        res = 0;
        while (i <= x) {
            res = res + i*i;
            i++;
        }
        return (res);
    }
    public static int Factorial(int x) {
        if (x < 0 || x > 12)
            return (0);
        if (x == 0)
            return (1);
        return (x * Factorial(x - 1));
    }
}