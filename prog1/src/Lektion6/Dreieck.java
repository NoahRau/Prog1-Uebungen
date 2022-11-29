package Lektion6;

import javax.sound.sampled.AudioSystem;
import java.util.Scanner;

public class Dreieck {

    public static String pyramide(int rows, String Ausgabe){

        String Space = "\s";

        for(int i = 1; i < rows; i++)
        {
            Space += "\s\s\s";
        }

        Ausgabe = Ausgabe + "   *  ";
        if(rows == 0){
            return "";
        }
        else {
            return Space + Ausgabe+"\n\r" +(pyramide(rows-1, Ausgabe));
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Höhe der Pyramide aus");
        int rows = scanner.nextInt();
        String Ausgabe ="";
        System.out.println(pyramide(rows, Ausgabe));

        scanner.close();
    }
}
