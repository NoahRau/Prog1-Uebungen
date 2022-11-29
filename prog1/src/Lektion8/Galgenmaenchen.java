package Lektion8;

import java.util.Scanner;

public class Galgenmaenchen {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Wort ein");
        String Wort = scanner.nextLine().toUpperCase();

        String Ausgabe = "";
        for(int i = 0; i <Wort.length(); i++){
            Ausgabe+="_";
        }
        char[] loesung = Wort.toCharArray();

        int Versuche = 0;


            do {try {
                System.out.println("Erraten sie das Wort" + Ausgabe);
                char eingabe = scanner.nextLine().toUpperCase().charAt(0);
                for (int i = 0; i < Wort.length(); i++) {
                    if (loesung[i] == eingabe) {

                        char[] chars = Ausgabe.toCharArray();
                        chars[i] = eingabe;
                        Ausgabe = String.valueOf(chars);
                    }

                }
                Versuche += 1;
                if (Wort.equals(Ausgabe)) {
                    System.out.println("Sie haben das Wort: " + Wort + " erraten");
                    break;
                }
            }catch (Exception e){scanner.nextLine();}
            } while (Versuche < 15);

        if(Versuche>=14)System.out.println("Sie haben das Wort nicht erraten das Wort war: " + Wort);
        scanner.close();
    }
}
