package lektion4;


public class Coutdown {

    public static void main(String[] args) throws InterruptedException
    {

        for(int time = 10 ; time >= 0 ; time-- )
        {
            System.out.println(time + " Sekunden verbleibend");
            Thread.sleep(1000);
        }
    }

}
