package Lektion12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class echteLottoziehung {


        public static void main(String[] args) {
            // Erstelle eine Liste mit den Zahlen 1-49
            Kugel list = new Kugel();

            // Erstelle einen Zufallsgenerator
            Random rand = new Random();

            // Ziehe 6 Zahlen
            int[] drawnNumbers = new int[6];
            for (int i = 0; i < 6; i++) {
                // Wähle eine zufällige Zahl aus der Liste aus
                int index = rand.nextInt(list.getSize());
                drawnNumbers[i] = list.getNode(index);

                // Entferne die gezogene Zahl aus der Liste, damit sie nicht erneut gezogen wird

            }

            // Sortiere die gezogenen Zahlen und gebe sie aus
            java.util.Arrays.sort(drawnNumbers);
            for (int drawnNumber : drawnNumbers) {
                System.out.println(drawnNumber);
            }
        }
    }




