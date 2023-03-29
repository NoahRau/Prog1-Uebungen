package UEKlausur;

public class wandleInCentsUm {
    public static char[] wandleUmInCents(String eingabe){
        eingabe =eingabe.replace(",","");
        char[] temp = eingabe.toCharArray();
        int i=0;
        while(temp[i]=='0')i++;
        char[] ausgabe=new char[temp.length-i];
        for(int y =0;y< ausgabe.length;y++){
            ausgabe[y]=temp[y+i];
        }
        return ausgabe;

    }
    public static void main(String[] args){
        System.out.println(String.valueOf(wandleInCentsUm.wandleUmInCents("09,99")));
    }
}
