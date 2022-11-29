package lektion4;

import java.util.Scanner;

public class querprodukt extends Exception {
    public static void main(String[] args){

        boolean eingabe = false ;
        Scanner scanner = new Scanner(System.in);
        int Eingabe = 0 ;
        int Querprodukt = 0;

        do{
            try{System.out.println("Geben sie eine Zahl zwischen 0 und 1Mio ein");
            Eingabe = scanner.nextInt();
            if(Eingabe >= 0 && Eingabe <=1000000 ) {
                eingabe = true;
            }
            }catch(Exception e){scanner.nextLine();}

        }while(!eingabe);

        for(int i = Eingabe;i > 0;i = i /10 ){
            System.out.println(Querprodukt);
            Querprodukt =Querprodukt *(i % 10);
        }
        System.out.println("Die Quersumme der Zahl: " + Eingabe + " ist: " + Querprodukt);
        scanner.close();


    }
}
