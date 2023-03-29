package UEKlausur;

public class PromilleRechner {
    public static int berechneAlkoholMasse(int volumen,double vProzent){
        final double dichte=0.8;
        return (int)(volumen*vProzent*dichte);
    }
    public static double berechneMasse(int A,int m,char type){
        try{
            double constant=0;
            if(type=='m')constant=0.7;
            if(type=='w')constant=0.6;
            if(type=='j')constant=0.5;
            return A/(constant*m);

        }catch(Exception e){
            System.out.println("Fehler!");
            return -1.0;
        }
    }
    public static void main(String[] args){
        int amasse=berechneAlkoholMasse(500,0.05);
        System.out.println("Die Alkoholmasse von 4l Bier beträgt: "+amasse);
        double promille = berechneMasse(amasse,70,'m');
        System.out.println("Die Promille beträgt:" + promille);
        if(promille>0.5)System.out.println("Sie dürfen kein Auto mehr fahren");
        if(promille<0.5&&promille>=0.3) System.out.println("Sie sollten kein Auto mehr fahren");
    }
}
