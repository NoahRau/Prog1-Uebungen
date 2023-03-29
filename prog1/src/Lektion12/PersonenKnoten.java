package Lektion12;

public class PersonenKnoten {
    private int alter;
    private String nachname;
    public PersonenKnoten next;

    public PersonenKnoten prev;

    public PersonenKnoten(String nachname,int alter){
        this.nachname=nachname;
        this.alter=alter;
    }
    public PersonenKnoten(PersonenKnoten person){
        this.nachname=person.getNachname();
        this.alter= person.getAlter();
    }

    public int getAlter() {
        return alter;
    }

    public String getNachname() {
        return nachname;
    }

    public PersonenKnoten getNext() {
        return next;
    }
    public PersonenKnoten getprev() {
        return prev;
    }


}
