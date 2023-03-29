package UEKlausur;

public class Stringmethode {
    public static String konket(String[] arr){
        String ausgabe = "";
        for(int i =0;i< arr.length;i++){
            if(i!=0)ausgabe+=";";
            if(arr[i]==null)ausgabe+="";
            else{
                ausgabe+=arr[i];
            }

        }
        return ausgabe;
    }
    public static void main(String[] args){
        String[] s=new String[]{"Gurken","Mehl","Milch","Karotten"};
        String[] a=new String[]{"Gurken"};
        String[] d=new String[]{""};
        String[] f=new String[]{};
        System.out.println(konket(a));
        System.out.println(konket(s));
        System.out.println(konket(d));
        System.out.println(konket(f));
    }
}

