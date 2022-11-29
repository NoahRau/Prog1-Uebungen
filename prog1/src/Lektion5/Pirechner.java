package Lektion5;

import java.util.Scanner;

public class Pirechner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int Radius = 1;
        System.out.println("Geben sie die Genauigkeit an an");
        long Genauigkeit = scanner.nextLong();
        double breite = (double)Radius/ Genauigkeit;
        double flaeche = 0 ;


        for(int i = 0; i < Genauigkeit; i++ ){
            double hoehe = Math.sqrt( Math.pow(Radius,2) - Math.pow((i*breite*Radius),2));
            flaeche = flaeche + breite * hoehe ;
        }

        double pi = 4*( flaeche);
        System.out.println("Pi ist Näherungsweise: " + pi);
        scanner.close();

    }
}
