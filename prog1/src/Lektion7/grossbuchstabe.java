package Lektion7;

import java.util.Scanner;

public class grossbuchstabe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String eingabe ="i";
        String Ausgabe = "";
       try{
            System.out.println("Geben sie einen Text ein");
            eingabe = scanner.nextLine();
        }catch(Exception e){scanner.nextLine();}

       char[] chars = eingabe.toCharArray();

        for(int i = 0; i <eingabe.length();i++){
            if(Character.isLowerCase(chars[i])){chars[i] =Character.toUpperCase(chars[i]);

            }
            Ausgabe = Ausgabe + Character.toString(chars[i]);

        }
        System.out.println(Ausgabe);
        scanner.close();
    }
}
