package Lektion6;

import java.util.Scanner;

public class Runden {

    public static double round( double Kommazahl ,int Nachkommastellen){

        int ZW = 10;
        double rounded;

        if(Nachkommastellen == 0 ){
            rounded = (int)Kommazahl;
            if((Kommazahl*ZW)%10 >=5 )rounded += 1;
        }
        else {
            for(int i = 1; i <= Nachkommastellen; i++){
                ZW *= 10;
            }
            rounded = (Kommazahl * ZW);
            if ((rounded % 10) >= 5) {
                rounded = ((int) (rounded/10) + 1);
            }
            else {
                rounded = ((int) (rounded/10));
            }
            rounded =  (rounded / ZW)*10;
        }
        return rounded;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Komma Zahl ein" );
        double Eingabe = scanner.nextDouble();
        System.out.println("Geben sie die Anzahl an Nachkommastellen an");
        int kommastellen = scanner.nextInt();
        System.out.println(Eingabe+" ist gerundet: "+ round(Eingabe, kommastellen ));
        scanner.close();

    }

}
