import java.io.*;
import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        int p;
        int a;
        int b;

        Scanner scan = new Scanner(System.in);
        System.out.println("/*****************************************/");
        System.out.println("/***********Les nombres Premiers***********/");
        System.out.println("/*****************************************/");
        System.out.print("Donner une valeur entiere : ");
        p = scan.nextInt();
        if (IsPrime(p) == 1)
            System.out.println(p+" est premier");
        else
            System.out.println(p+" n'est pas premier !");
        System.out.println("/*****************************************/");
        System.out.println("/************Les nombres Amis**************/");
        System.out.println("/*****************************************/");
        System.out.print("Donner la premiere valeur entiere: ");
        a = scan.nextInt();
        System.out.print("Donner la deuxieme valeur entiere: ");
        b = scan.nextInt();
        if (SumDiv(a) == b && SumDiv(b) == a)
            System.out.println(a+" et "+b+" sont des Nombres Amicaux");
        else
            System.out.println(a+" et "+b+" ne sont PAS Amicaux !");
    }
    public static int IsPrime(int x) {
        int i;

        i = 2;
        if (x <= 1)
            return (0);
        while (i < x) {
            if (x % i == 0)
                return (0);
            i++;
        }
        return (1);
    }
    public static int SumDiv(int x) {
        int i;
        int sum;

        i = 1;
        sum = 0;
        while (i <= x /2) {
            if (x % i == 0)
                sum += i;
            i++;
        }
        return (sum);
    }
}