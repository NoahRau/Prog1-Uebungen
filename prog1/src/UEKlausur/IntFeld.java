package UEKlausur;

public class IntFeld {
    public static int vielfaches(int[] eingabe){
        int ausgabe=0;
        for(int i=0;i<eingabe.length-1;i++){
            if(eingabe[i]!=0){
                if(eingabe[i]%3==0)ausgabe++;
            }
        }
        return ausgabe;
    }

    public static double harmoReihe(){
        double ausgabe=0;
        for(int k=1;k<=1000;k++){
            double zw=Math.pow((-1),k+1)/k;
            if(k%2==0){ausgabe+=zw;}
            else ausgabe-=zw;
        }
        return ausgabe;
    }

}
