package UEKlausur;

public class Bruttopreis {
    public static double nettopreis(double Brutto,double mwst){
        mwst=mwst*100;
        return (Brutto*100)/(100+mwst);
    }
    public static void main(String[] args){
        System.out.println(Bruttopreis.nettopreis(1.07,0.07));
    }
}
