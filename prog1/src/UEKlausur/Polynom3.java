package UEKlausur;

public class Polynom3 {
    int grad;
    double[] werte;

    public Polynom3(int grad,double[] werte){
        this.grad=grad;
        this.werte=werte;
    }
    @Override
    public String toString(){
        String ausgabe="";
        for(int i=0;i<grad;i++)
        {
            ausgabe+=werte[i]+"x^"+(grad-i)+"+";
        }
        return ausgabe+=werte[werte.length-1];
    }
    public void leiteAb(){
        double[] zw=new double[werte.length-1];
        for(int i=0;i< zw.length-1;i++)
        {
            zw[i]=werte[i]*(grad-i);
        }
        zw[zw.length-1]=werte[zw.length-1];
        this.werte=zw;
        this.grad-=1;

    }
    public double berechneAnDerStelleX(double x){

        double ergebnis =0;
        for(int i =0;i< werte.length;i++){
            ergebnis+=werte[i]*Math.pow(x,grad-i);
        }
        return ergebnis;

    }
    public static void main(String[] args){
        int grad =3;
        double[] werte=new double[]{1.5,4,1.3,-8};
        Polynom3 s=new Polynom3(grad,werte);
        System.out.println(s);
        System.out.println(s.berechneAnDerStelleX(2));
        s.leiteAb();
        System.out.println(s);
        System.out.println(s.berechneAnDerStelleX(2));
    }
}