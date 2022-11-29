package Lektion10;

import Lektion9.Auto;

public class Autofabrik extends Auto {

    public static void buildAuto(){
        Auto fabrik1 = new Auto("X1","BMW",100);
    }

    public static void main(String[] args){

        int bestellteAutos = 10;

        for(int i=0; i <bestellteAutos;i++){
            buildAuto();
        }

        System.out.println(Seriennummer);
    }
}
