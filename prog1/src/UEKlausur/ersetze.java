package UEKlausur;

import javax.management.StringValueExp;
import javax.print.DocFlavor;

public class ersetze {
    public static int replace(char[] name) {

        int rückgabe = 0;
        for (int i = 0; i < name.length - 5; i++) {
            if (name[i] == '.') {
                name[i] = '_';
                rückgabe++;
            }
        }
        return rückgabe;
    }

    public static void main(String[] args) {
        String name="Graphik.Init.Datei.ini";
        char[] eingabe = name.toCharArray();
        System.out.println(replace(eingabe));
        System.out.println(String.valueOf(eingabe));

    }
}
