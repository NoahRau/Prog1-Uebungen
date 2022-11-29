package Lektion6;

import java.util.Scanner;

public class Rekursion {
    public static double x (int n, int basis){
       if(n == 0 ){
           return 1;
       }
       else if (n>0){
            return basis * x(n-1, basis);
       }
       else{
           n=n*-1;
           return 1/(basis*x(n-1, basis));
       }

    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Basis x ein");
        int x = scanner.nextInt();
        System.out.println("Geben sie den Exponet n ein");
        int n = scanner.nextInt();
        System.out.println(x(n,x));




    }
}
