package Lektion5;

import static java.lang.Math.pow;

public class reihenwertBerechnung {

    public static void main(String[] args){

        int k = 1;
        double summe =0.0;

        do{
            k =k+1;
            summe += 1.0/ pow(k,2);
            double a = 6 * summe;
            System.out.println("Die Reihe a ist: " + a);
            if( (1.0/ pow(k,2))<= pow(10,-5)){
                System.out.println("Der minimal Wert ist erreicht");
                break;
            }

        }while(true);
    }
}
