package Lektion9;

public class Raum {

    String Name;
    private int Plaetze;
    int Studenten;

    public Raum(String Name, int Plaetze){
        this.Name = Name;
        this.Plaetze = Plaetze;
    }
    public int getPlaetze(){return Plaetze;}
    public String getName(){return Name;}
    public void setStudenten(int Studis){Studenten = Studis;}
    public boolean belegt(){
        if(Studenten >=Plaetze)return true;
        else return false;
    }

    public static void main(String[] args){

        Raum[] raeume = new Raum[2];
        raeume[0] = new Raum("I1.2.1",4);
        raeume[1] = new Raum("I1.2.15",4);

        raeume[0].setStudenten(3);
        raeume[1].setStudenten(4);
        for(int i = 0; i<2;i++){
            if(raeume[i].belegt()){System.out.println("Der Raum " + raeume[i].getName() + " ist Voll");}

        }


    }
}
