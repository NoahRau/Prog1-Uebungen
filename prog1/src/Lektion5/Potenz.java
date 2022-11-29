package Lektion5;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Potenz n ein:");
        int n = scanner.nextInt();
        System.out.println("Geben sie eine Basis b ein");
        double b = scanner.nextDouble();
        double ergebnis = 1;

        if (n == 0) {
            System.out.println(ergebnis);
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ergebnis *= b;
            }
            System.out.println(ergebnis);
        }
        if (n < 0) {
            for (int i = -1; i >= n; i--) {
                ergebnis *= b;

            }
            System.out.println(1.0 / ergebnis);
        }
    }
}
