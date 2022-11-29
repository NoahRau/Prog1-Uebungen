package Lektion6;

import java.util.Scanner;

public class Spruenge {


    public static int sprung(int laenge, int weite1, int weite2) {

        if (laenge < 0) return 0;
        if (laenge == 0) return 1;
        return sprung(laenge - weite1, weite1, weite2) + sprung(laenge - weite2, weite1, weite2);
    }


    public static void main(String[] args) {
        String Ausgabe = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die laenge ein");
        int laenge = scanner.nextInt();
        System.out.println("Geben sie die weite1 ein");
        int weite1 = scanner.nextInt();
        System.out.println("Geben sie die weite2 ein");
        int weite2 = scanner.nextInt();
        System.out.println(sprung(laenge, weite1, weite2));
    }
}
