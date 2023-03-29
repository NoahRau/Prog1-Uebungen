package UEKlausur;

public class Stringi {
    public static String replace2Leer(String satz){
        satz=satz.replace("  ", " ");
        return satz;
    }
    public static void split(String satz){
        int last=0;
        char[] zw=satz.toCharArray();
        int count=1;
        for(int i=0;i<satz.length();i++){
            if(zw[i]==' '){
                count++;
            }
        }

        String[] split=new String[count];
        count=0;
        for(int i=0;i<satz.length();i++){
            if(zw[i]==' '){
                split[count]=satz.substring(last,i);
                count++;
                last=i+1;
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(split[i]);
        }
    }
    public static void main(String[] args){
        System.out.println(replace2Leer("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!"));
        split(replace2Leer("Ich gehe morgen mit meinen 11 Freund*innen zum Essen!"));
    }
}
