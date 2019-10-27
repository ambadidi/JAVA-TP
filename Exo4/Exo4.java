import java.io.*;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        int A;
        int B;
        int r;
        int tempA;
        int tempB;

        Scanner scan = new Scanner(System.in);
        System.out.print("Donner une valeur entiere non nulle A = ");
        A = scan.nextInt();
        System.out.print("Donner une autre valeur entiere non nulle B = ");
        B = scan.nextInt();
        tempA = A;
        tempB = B;
        while (B > 0) {
            r = A % B;
            A = B;
            B = r;
        }
        System.out.print("Le PGCD de "+tempA+" et "+tempB+" est : "+A);
    }
}