package Lektion11;

public class ticker {
    char[] nachricht;

    public ticker(int laenge){
        if(laenge<=0)laenge=200;
        nachricht = new char[laenge];
        for(int i = 0;i<laenge;i++)
        {
            nachricht[i]=' ';
        }
    }
    public int getgroesse(){
        return nachricht.length;
    }

    public void setNachricht(char[] nachricht) {
        for(int i = 0;i<nachricht.length;i++)
        {
            this.nachricht[i]=nachricht[i];
        }
        for(int i = nachricht.length;i<this.nachricht.length;i++)this.nachricht[i]='+';

    }

    public char[] getNachricht() {
        return nachricht;
    }
    public void resetNachricht(char zeichen){
        for(int i = 0;i<nachricht.length;i++)nachricht[i]=zeichen;
    }
    public void resetNachricht(){
        for(int i = 0;i<nachricht.length;i++)nachricht[i]='+';
    }
    public void rotateNachricht(int distance){
        if(distance<0 || distance<nachricht.length){
            char[] last = new char[distance];
            for(int i = 0;i <distance;i++)last[i]=nachricht[i];
            System.arraycopy(nachricht, distance, nachricht, 0, nachricht.length-distance );
            for(int i = nachricht.length-distance;i < nachricht.length;i++)
            {nachricht[i]=last[i-(nachricht.length-distance)];}

        }
    }

}
