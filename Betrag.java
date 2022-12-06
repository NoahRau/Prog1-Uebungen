package Lektion11;

public class Betrag {
    public static int Betragv(int eingabe){
        if(eingabe<0)eingabe*=(-1);
        return eingabe;
    }
    public static double Betragv(double eingabe){
        if(eingabe<0)eingabe*=(-1);
        return eingabe;
    }
    public static float Betragv(float eingabe){
        if(eingabe<0)eingabe*=(-1);
        return eingabe;
    }
    public static long Betragv(long eingabe){
        if(eingabe<0)eingabe*=(-1);
        return eingabe;
    }
    public static short Betragv(short eingabe){
        if(eingabe<0)eingabe*=(-1);
        return eingabe;
    }
    public static void main(String[] args){
        int a = -2;
        float b = -2.0f;
        double c = -2.0;
        long d = -2;
        short e =-2;
        System.out.println(Betragv(a)+" "+Betragv(b)+" "+Betragv(c)+" "+Betragv(d)+" "+ Betragv(e));

    }
}
