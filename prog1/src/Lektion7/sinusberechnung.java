package Lektion7;

import java.util.Scanner;

public class sinusberechnung {

    /**
     * Berechnet den Sinus von der übergebenen Zahl x.
     * @param x reelle Zahl (in RAD), von der der Sinus berechnet werden soll.
     * @return Ergebnis des Sinus; reelle Zahl zwischen -1 und 1 (beide inklusive)
     */

    public static double sinus(double x){

        double zaehler = x;
        double nenner = 1.0;
        double summe = zaehler/nenner;
        double summand = zaehler/nenner;

        for(int i = 3;summand>1E-15 || summand < -1E-15;i=i+2){
            zaehler = zaehler *x*x*(-1);
            nenner = nenner * i *(i-1);
            summand = zaehler/nenner;
            summe = summe+summand;
        }
        return summe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ein x Wert ein um den sin(x) Wert zu berechnen");
        double x = scanner.nextDouble();
        System.out.println("Der sinus wert von: "+x+" ist: " +sinus(x));

    }

}
