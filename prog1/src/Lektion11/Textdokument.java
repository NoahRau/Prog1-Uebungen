package Lektion11;

import java.util.Arrays;

public class Textdokument {
    static char[][] dokument = {{'a','b',' ','s'},{'a','s','_','s'},{'a'}};

    public static int zaehleZeichen(){
        int zeichen=0;
        for(int i = 0; i<dokument.length;i++){
            for(int y = 0;y<dokument[i].length;y++){
                if(dokument[i][y]!=' '||dokument[i][y]!='_')zeichen++;
            }

        }
        return zeichen;
    }
    public static boolean vertauscheZeilen(int zeile1,int zeile2){
        if(zeile1>dokument.length||zeile2>dokument.length||zeile1==zeile2)return false;
        else{
            char[] ZS=dokument[zeile1];
            dokument[zeile1]=dokument[zeile2];
            dokument[zeile2]=ZS;
            return true;
        }
    }
    public static void fuegeEinTextdokument(char[][] Text,int Zeilenposition){
        if(Zeilenposition+Text.length-1<dokument.length){
            for(int i = Zeilenposition;i<dokument.length;i++){
                dokument[i]=Text[i-Zeilenposition];
            }
        }
        else throw new RuntimeException("Ungültige Zeilenposition");

    }
    public static void main(String[] args){
        System.out.println(zaehleZeichen());
        System.out.println(Arrays.toString(dokument[0]));
        System.out.println(Arrays.toString(dokument[1]));
        System.out.println(vertauscheZeilen(0,1));
        System.out.println(Arrays.toString(dokument[0]));
        System.out.println(Arrays.toString(dokument[1]));
        int pos =1;
        char[][] arr={{'a','b'},{'c','f'}};
        fuegeEinTextdokument(arr,pos);
        System.out.println(Arrays.toString(dokument[0]));
        System.out.println(Arrays.toString(dokument[1]));
        System.out.println(Arrays.toString(dokument[2]));


    }
}
