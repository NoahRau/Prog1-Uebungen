package Lektion12;

public class LinkedList {

    private  PersonenKnoten head;
    private  PersonenKnoten tail;
    private int size;

    public LinkedList(){
        this.size=0;
        head = null;
        tail = null;
    }
    public int getSize(){
        return size;
    }

    public PersonenKnoten getHead() {
        return head;
    }

    public PersonenKnoten getTail() {
        return tail;
    }

    public void insert(String nachname, int alter){
        PersonenKnoten person = new PersonenKnoten(nachname,alter);
        insert(person);
    }
    public void insert(PersonenKnoten person) {
        PersonenKnoten newPersonenKnoten = new PersonenKnoten(person);
        PersonenKnoten temp = head;

        if (head == null) {
            head = newPersonenKnoten;
            tail = newPersonenKnoten;
            return;
        }

        if (temp.getAlter() > newPersonenKnoten.getAlter()) {
            newPersonenKnoten.next = head;
            head.prev = newPersonenKnoten;
            head = newPersonenKnoten;
            return;
        }

        while (temp.next != null && temp.next.getAlter() < newPersonenKnoten.getAlter()) {
            temp = temp.next;
        }

        newPersonenKnoten.next = temp.next;
        newPersonenKnoten.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newPersonenKnoten;
        }
        temp.next = newPersonenKnoten;
        if (newPersonenKnoten.next == null) {
            tail = newPersonenKnoten;
        }
        size++;
    }
    public PersonenKnoten search(String nachname){
        PersonenKnoten temp = head;
        boolean gefunden=false;
        for(int i = 0;i<=size;i++) {
            if (nachname.equals(temp.getNachname())){
                gefunden=true;
                break;
            }
            temp = temp.next;
        }
        if(gefunden)return temp;
        else return null;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        // Testen Sie das Hinzufügen und Sortieren von Elementen in der Liste
        list.insert("Müller", 30);
        list.insert("Schmidt", 45);
        list.insert("Meier", 35);
        list.insert("May", 37);
        System.out.println( list.getSize());
        System.out.println( list.getHead().getNachname());
        System.out.println( list.getHead().next.getNachname());
        System.out.println( list.getHead().next.next.getNachname());
        System.out.println( list.getHead().next.next.next.getNachname());
        System.out.println( list.getTail().prev.getNachname());
        System.out.println( list.getTail().getNachname());


        // Testen Sie das Suchen eines Elements in der Liste
        System.out.println( list.search("Schmidt").getAlter());
        if(list.search("Smith")== null)System.out.println("Fehler");
    }

    }


