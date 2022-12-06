package Lektion11;

import java.util.Scanner;

public class TageImMonat {
        public static int tageImMonat(String monat)
        {
            int tage = switch(monat)
                    {
                        case "Februar" -> 28;
                        case "April", "Juni", "September", "November" -> 30;
                        case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                                "Dezember" -> 31;
                        default -> throw new RuntimeException("falscher Monatsname");
                    };
            return tage;
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String monat = "";
            int tage;

            while(true){
                try{
                System.out.println("Geben sie ein gültigen Monat ein: ");
                monat = scanner.nextLine();
                tage =tageImMonat(monat);
                break;
            }catch (Exception e){scanner.nextLine();}

            }
            System.out.println("Der Monat "+monat+" hat "+tage+" Tage");
        }

}
