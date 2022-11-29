package Lektion6;

import java.util.Scanner;

public class Fakultät {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Fakultaet ein");
        int Eingabe = scanner.nextInt();
        //System.out.println(rekursiv(Eingabe));
        double fak = Eingabe;
        if(Eingabe == 0 || Eingabe == 1){fak = 1;}
        while(Eingabe >1){
            fak= fak * (Eingabe-1);
            Eingabe = Eingabe -1;
        }

        System.out.println(fak);
    }
}
