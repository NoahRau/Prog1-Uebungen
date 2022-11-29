package lektion4;

    import java.util.Scanner;

    public class freierFall {

        public static void main(String[] args) throws InterruptedException {


            double g  = 9.80665;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben sie die Fall dauer ein");
            int zeit = scanner.nextInt();

            for(int i = 1 ; i <= zeit ; i++) {
                double weg = (0.5*g*Math.pow(i,2));
                Thread.sleep(1000);
                if (i%5 == 1) {
                    System.out.println("Zeit: " + i + "Sekunden: Zurueckgelegte Strecke : " + weg + "m");
                }
            }
            scanner.close();
        }

    }

