package Lektion13;

public class DreiDPunkt {
    Punkt point;
    public DreiDPunkt(int a,int b,int c){
        point = new Punkt(a,b,c);
    }
    public double berechneAbstand(){
        return point.berechneAbstand();
    }
    @Override
    public String toString() {
        return point.toString();
    }
    private class Punkt{
        int a;
        int b;
        int c;
        public Punkt(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double berechneAbstand(){
            return Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        }

        public  String toString() {
            return "a="+a+" b="+b+" c="+c;
        }
    }
    public static void main(String[] args){
        DreiDPunkt Punkt= new   DreiDPunkt(3,4,5);
        String ausgabe = Punkt.toString();
        System.out.println(Punkt);
        System.out.println((int)Punkt.berechneAbstand());
    }
}
