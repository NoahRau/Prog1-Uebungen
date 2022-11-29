package Lektion7;

import java.util.Scanner;

public class arithmetischeabweichung
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Geben sie die Anzahl an einzugebenden Werten an");
            int Anzahlzahlen = scanner.nextInt() ;

            double[] Werte =new double[Anzahlzahlen];

            for(int i= 0; i <Anzahlzahlen;i++){
                System.out.println("Geben sie den "+(i+1)+" Wert ein");
                Werte[i]=scanner.nextDouble();
                if(Werte[i]>0)System.exit(0);
            }

            double groessterWert = 0;
            double kleinsterWert = 10000000;
            double summe = 0;
            for(int i = 0; i < Anzahlzahlen; i++){

                if(Werte[i]>=groessterWert){
                    groessterWert = Werte[i];
                }
                if(Werte[i]<=kleinsterWert){
                    kleinsterWert = Werte[i];
                }
                summe += Werte[i];


            }
            System.out.println("Der kleinste Wert ist: "+kleinsterWert);
            System.out.println("Der groesste Wert ist: "+groessterWert);
            System.out.println("Der Arithmetischemittelwert ist: "+(summe/Anzahlzahlen));




        }catch(Exception e){scanner.nextLine();}
        scanner.close();
    }
}
