package Lektion5;

import java.util.Scanner;

public class quadratwurzelrechner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ein x Wert ein: ");
        double x = scanner.nextDouble();
        System.out.println("Geben sie einen Naeherungswert ein: ");
        double y = scanner.nextDouble();

        do{
            y=((x/y + y)/2);

        }while((((x/y)-y) <= -0.00000000000001) || (((x/y)-y) >= 0.00000000000001) );

        System.out.println("Ihr Wert ist " + y);

    }
}
