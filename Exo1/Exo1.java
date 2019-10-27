import java.io.*;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        double n;
        
            Scanner scan = new Scanner(System.in);
            System.out.print("Entrer une valeur reelle: ");
            n = scan.nextDouble();
            System.out.println("La valeur absolue de "+n+" est : "+abs(n));
    }
    public static double abs(double x) {
        if (x < 0)
            return (-x);
        else
            return (x);
    }
}