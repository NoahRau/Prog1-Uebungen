package Lektion10;


public class Raumbelegung2 {


    String Name;
    private int Plaetze;
    int Studenten =0;

    Student[] Studisimraum =new Student[4];

    public Raumbelegung2(String Name, int Plaetze){
        this.Name = Name;
        this.Plaetze = Plaetze;

    }
    public int getPlaetze(){return Plaetze;}
    public String getName(){return Name;}
    public boolean belegt(){
        if(Studenten >=Plaetze)return true;
        else return false;
    }
    public void Studentbetreten(Student Musterstudent){
        if(!belegt())
        {
            Studenten++;
            Studisimraum[Studenten] = Musterstudent;

        }

    }

    public void Studentenverlassen(Student Musterstudent){Studenten--;
        if(Studenten==0){

            Studisimraum[Studenten] = null;

        }
    }

    public String whoishere(){
        String ausgabe="";

        for(int i = 0 ; i<4; i++){
            try{ausgabe+=Studisimraum[i].Name+" "+Studisimraum[i].Nachname+" "+Studisimraum[i].Matrikelnummer + " \n\r";}catch(Exception e){}
        }
        return ausgabe;
    }


    public static void main(String[] args) {

        Raumbelegung2[] raeume = new Raumbelegung2[2];
        raeume[0] = new Raumbelegung2("I1.2.1", 2);
        raeume[1] = new Raumbelegung2("I1.2.15", 2);
        Student[] studis = new Student[4];
        studis[0] = new Student("Max", "Mustermann", 5435353);
        studis[1] = new Student("Elon", "Musk", 544353);
        studis[2] = new Student("Elon", "Tusk", 543533);
        studis[3] = new Student("Rick", "Sanchez", 5435353);

        int Zahl = 0;

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 2; y++) {
                if (!raeume[i].belegt()) {
                    raeume[i].Studentbetreten(studis[Zahl]);
                    Zahl++;
                }

                if (raeume[i].belegt()) {
                    System.out.println("Der Raum " + raeume[i].getName() + " ist Voll");
                    System.out.println("Hier sind: ");
                    System.out.println(raeume[i].whoishere());
                }

            }


        }
    }}
