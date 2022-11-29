package Lektion9;

public class Pizza {

    String Name;
    double Durchmesser;
    double Preis;

    public Pizza(String Name, double Durchmesser, double Preis){

        this.Name = Name;
        this.Durchmesser = Durchmesser;
        this.Preis = Preis;

    }

    public String getName(){
        return Name;
    }
    public double getPreis(){
        return Preis;
    }
    public double getDurchmesser(){
        return Durchmesser;
    }
    public double getPreisProQuadratCM(){
        return Preis/Durchmesser;

    }

    public static void main(String[] args){

        Pizza[] pizzas = new Pizza[5];

        pizzas[0] = new Pizza("Funghi",20.0,10.0);
        pizzas[1] = new Pizza("Calzone",27.0,10.0);
        pizzas[2] = new Pizza("Caprese",26.0,15.0);
        pizzas[3] = new Pizza("Capricciosa",23.0,10.0);
        pizzas[4] = new Pizza("Diavola",30.0,14.0);

        int x = 0;

        for(int i = 1; i <5; i++)
        {if (pizzas[i].getPreisProQuadratCM() < pizzas[x].getPreisProQuadratCM()) x = i;
            System.out.println(pizzas[i].getName());
        }

        System.out.println("Die Pizza mit dem besten Preis/Leistungsverhältnis ist: " + pizzas[x].getName());


    }

}
