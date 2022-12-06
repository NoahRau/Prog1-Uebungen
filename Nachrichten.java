package Lektion11;

import java.util.Arrays;

public class Nachrichten {
    public static void main(String[] args){
        ticker nachricht = new ticker(50);
        String eingabe = "Schnee in Wuerzburg";
        nachricht.setNachricht(eingabe.toCharArray());
        System.out.println(Arrays.toString(nachricht.getNachricht()));
        nachricht.rotateNachricht(14);
        System.out.println(Arrays.toString(nachricht.getNachricht()));
    }
}
