package Lektion6;

import java.util.Scanner;

public class primzahlnew {

    public static boolean prim(int Zahl){

        boolean primbo = false ;
        for (int i = 2; i < Zahl; i++ )
        {
            if (Zahl % i == 0)
            {
                primbo = true;
                break;
            }
        }
                return primbo;
    }

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int Zahl = scanner.nextInt();

        boolean prim = prim(Zahl);

        if (!prim) {
            System.out.println(Zahl + " Ist eine Primzahl");
        }
        else {
            System.out.println(Zahl +" Ist keine Primzahl");
        }
        scanner.close();
    }
}
