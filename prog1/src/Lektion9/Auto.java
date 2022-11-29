package Lektion9;

public class Auto {
     String Marke;
     String Name;
     int PS;

    public static int Seriennummer = 0;

    public Auto(){
        Seriennummer++;
    }
     public Auto(String Name, String Marke, int PS){

         this();
         Name = this.Name;
         Marke = this.Marke;


         if(this.PS > 0) PS = this.PS;
         else PS =100;


     }

     public String getCarName(){
         return Name;

     }

    public String getCarMarke(){
        return Marke;

    }

    public int getCarPS(){
        return PS;

    }

}
