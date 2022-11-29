package Lektion7;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class bsprachspiel {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String eingabe ="";
            String Ausgabe = "";
            int schiebungsfaktor = 0;
            try{
                System.out.println("Geben sie einen Text ein");
                eingabe = scanner.nextLine();
            }catch(Exception e){scanner.nextLine();}

            char[] chars = eingabe.toCharArray();



            for(int i = 0; i < chars.length; i++){
                if((chars[i] == 97)||(chars[i] == 101)||(chars[i] == 105)||(chars[i] == 111)||(chars[i] == 117)) {
                    schiebungsfaktor += 2;
                }
            }

            char[] aus = new char[chars.length + schiebungsfaktor];
            schiebungsfaktor =0;

            for(int i = 0; i < chars.length; i++){
                aus[i+schiebungsfaktor] =chars[i];
                if((chars[i] == 97)||(chars[i] == 101)||(chars[i] == 105)||(chars[i] == 111)||(chars[i] == 117)) {
                    aus[i+schiebungsfaktor+1] = 'b';
                    aus[i+schiebungsfaktor+2] = chars[i];
                    schiebungsfaktor += 2;
                }

            }
            Ausgabe = String.valueOf(aus);

            System.out.println(Ausgabe);
            scanner.close();
        }
    }

