package Lektion7;

import java.util.Scanner;

public class Eurostueck {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie die Durchlaufzahl an");
        int Durchlaufzahl = scanner.nextInt();

        double S1 = 0;
        double S2 = 0;
        double S3 = 0;



        for(int i= 0; i <Durchlaufzahl;i++){
            if(Math.random()>= 0.5){
                double Schubladen = (Math.random()*9);
                if(Schubladen <= 3)S1 +=1;
                if(Schubladen > 3 && Schubladen <=6)S2 +=1;
                if(Schubladen > 6)S3 +=1;
            }

        }
        S1=(S1/Durchlaufzahl)*100;
        S2=(S2/Durchlaufzahl)*100;
        S3=(S3/Durchlaufzahl)*100;
        System.out.println("Wahrscheinlichkeit Muenze in Schublade 1: "+String.format("%.2f", S1)+" %");
        System.out.println("Wahrscheinlichkeit Muenze in Schublade 2: "+String.format("%.2f", S2)+" %");
        System.out.println("Wahrscheinlichkeit Muenze in Schublade 3: "+String.format("%.2f", S3)+" %");

    }
}
