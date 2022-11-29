package Lektion10;

import java.rmi.MarshalException;

public class Student {

    int Matrikelnummer;
    String Name;
    String Nachname;

    public Student(String Name, String Nachname ,int Matrikelnummer){

        this.Name=Name;
        this.Nachname = Nachname;
        this.Matrikelnummer = Matrikelnummer;

    }
    public String getName(){return Name;}
    public String getNachname(){return Nachname;}
    public int getMatrikelnummer(){return Matrikelnummer;}
}
