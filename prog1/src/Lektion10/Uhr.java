package Lektion10;

public class Uhr {

    int stunden;
    int minuten;
    int sekunden;


    public Uhr(int stunden,int minuten,int sekunden)
    {
        errorEingabe();
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }

    public void errorEingabe(){
        if((stunden>24)||(stunden<0)||(minuten>60)||(minuten<0)||(sekunden>60)||(sekunden<0))
        {
            stunden=12;
            minuten=0;
            sekunden=0;
        }
    }
    public int getStunden(){return stunden;}
    public int getMinuten(){return minuten;}
    public int getSekunden(){return sekunden;}

    public void update(){
        if(sekunden==60){sekunden=0;
            minuten++;
        }
        if(minuten==60){minuten=0;
            stunden++;
        }
        if(stunden == 24)stunden=0;


    }

    public void naechsteSek(){
        sekunden++;
        update();
    }
    public void setUhr(int stunden,int minuten,int sekunden)
    {
        errorEingabe();
        this.stunden = stunden;
        this.minuten = minuten;
        this.sekunden = sekunden;
    }

    public static void main(String[] args){

        int anzahlUhren=24;
        int stundenzahl=0;

        Uhr[] uhrzeiten = new Uhr[anzahlUhren];
        for (int i = 0;i<anzahlUhren;i++){

            int minutenzahl = 59;
            int sekundenzahl = 59;
            uhrzeiten[i] =new Uhr(stundenzahl,minutenzahl,sekundenzahl);
            stundenzahl++;
        }
        for(int i = 0;i<anzahlUhren;i++){uhrzeiten[i].naechsteSek();
        System.out.println("Die Uhrzeit beträgt: "+uhrzeiten[i].getStunden()+":"+uhrzeiten[i].getMinuten()+":"+uhrzeiten[i].getSekunden());
        }

    }

}
