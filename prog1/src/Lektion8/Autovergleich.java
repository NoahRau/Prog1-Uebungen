package Lektion8;


public  class Autovergleich {

    public static void main(String[] args){
        Autos car1 = new Autos();
        Autos car2 = new Autos();
        Autos car3 = new Autos();
        car1.Name = "Golf";
        car1.Marke = "VW";
        car1.PS = 100;
        car2.Name = "X1";
        car2.Marke = "BMW";
        car2.PS = 200;
        car3.Name = "Chiron";
        car3.Marke = "Bugatti";
        car3.PS = 1000;


        if(car1.PS > car2.PS && car1.PS > car2.PS){
            System.out.println(car1.Marke +" "+car1.Name + " Hat die meisten PS");
        }
        if(car2.PS > car1.PS && car2.PS > car3.PS){
            System.out.println(car2.Marke +" "+car2.Name + " Hat die meisten PS");
        }
        if(car3.PS > car2.PS && car3.PS > car1.PS){
            System.out.println(car3.Marke +" "+car3.Name + " Hat die meisten PS");
        }


    }

}
