package lektion4;

public class temperaturtabelle {

    public static void main (String[] args){

        System.out.println("Fahrenheit\tCelsius");
        for(int i = 0;i <=300;i++){
            double Celsius = 5.0/9 * (i - 32);
            System.out.println(i + "\t\t\t" + String.format("%.2f", Celsius) );

        }

    }

}
