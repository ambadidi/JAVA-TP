import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Exo5 {
    public static void main(String[] args) {
        double  A;
        double  B;
        double  C;
        double  X1;
        double  X2;
        double  Delta;

        Scanner scan = new Scanner(System.in);
        System.out.println("On resout, sur R, une equation du second degre sous la forme AX²+BX+C :");
        System.out.print("Donner le coefficient A = ");
        A = scan.nextDouble();
        System.out.print("Donner le coefficient B = ");
        B = scan.nextDouble();
        System.out.print("Donner le coefficient C = ");
        C = scan.nextDouble();
        if (A == 0) {
            if (B == 0) {
                if (C == 0)
                    System.out.println("L'ensemble R est solution de notre equation !");
                else
                    System.out.println("Il n'existe pas de solution dans R pour notre equation !");
            }
            else {
                X1 = C / B;
                System.out.println(A+"X²+"+B+"X+"+C+" admet une unique solution X = "+X1);
            }
        }
        else {
            Delta = B * B - 4 * A * C;
            if (Delta < 0)
                System.out.println(A+"X²+"+B+"X+"+C+" n'a pas de soulution sur R !");
            else if (Delta == 0)
                System.out.println(A+"X²+"+B+"X+"+C+" admet une unique solution X = "+(-B / (2 * A)));
            else {
                    X1 = (-B + Math.sqrt(Delta)) / (2 * A);
                    X2 = (-B - Math.sqrt(Delta)) / (2 * A);
                    System.out.println(A+"X²+"+B+"X+"+C+" admet deux solutions distinctes: X1 = "+X1+" et X2 = "+X2);
            }
        }
    }
}