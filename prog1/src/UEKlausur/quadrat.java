package UEKlausur;

public class quadrat {

    public static String quadratZeilen(int zeilen){
        String ausgabe="";
        for(int i =0;i<zeilen;i++){
            if(i==0||i==zeilen-1){
                for(int y = 0;y<zeilen;y++)ausgabe+="*";
            }

            else {
                for(int y = 0;y<zeilen;y++){
                    if(y==0||y==zeilen-1)ausgabe+="*";
                    else ausgabe+=" ";
                }
            }
            ausgabe+="\n\r";
        }
        return ausgabe;
    }
    public static void main(String[] args){
       System.out.println(quadrat.quadratZeilen(4));
    }
}
