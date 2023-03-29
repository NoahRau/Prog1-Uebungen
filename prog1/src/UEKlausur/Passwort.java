package UEKlausur;

public class Passwort {

    public String passwort;

    public Passwort(String pw){
        if(alsPWGeignet(pw))this.passwort=pw;
        else this.passwort =null;
    }

    public static boolean alsPWGeignet(String pw){
        char[] pass = pw.toCharArray();
        if(pass.length<8)return false;
        int uppercase=0;
        int lowercase=0;
        int nummer=0;
        for(int i =0;i<pass.length-1;i++){
            if(Character.isUpperCase(pass[i]))uppercase++;
            if(Character.isLowerCase(pass[i]))lowercase++;
            if(Character.isDigit(pass[i]))nummer++;
        }
        if(uppercase>=2&&lowercase>=2&&nummer>=2)return true;
        else return false;
    }

    @Override
    public String toString(){
        if(passwort==null)return "Kein gueltiges Passwort!";
        else {
            String ausgabe="";
            for(int i = 0;i<this.passwort.length()-1;i++){
                ausgabe+="*";
            }
            return ausgabe;
        }

    }
    public boolean pwAendern(String pw){
        if(this.passwort==null)return false;
        if(this.passwort.equals(pw))return false;
        if(alsPWGeignet(pw)&&(pw.charAt(0)!=this.passwort.charAt(0))&&(pw.charAt(pw.length()-1)!=this.passwort.charAt(this.passwort.length()-1))) {
            this.passwort = pw;
            return true;
        }
        else return false;
    }
}
