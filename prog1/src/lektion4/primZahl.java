package lektion4;

import java.util.Scanner;

public class primZahl {

    public static void main(String[] args) {

        boolean prim = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int Zahl = scanner.nextInt();

        for (int i = 2; i < Zahl; i++ )
        {if (Zahl % i == 0)
            {
                prim = true;
                break;
            }
        }
        if (!prim) {
            System.out.println(Zahl + " Ist eine Primzahl");
        }
        else {
            System.out.println(Zahl +" Ist keine Primzahl");
        }
        scanner.close();
    }
}
