package UEKlausur;

public class OnlineSHop {
    public class Bestellung{
        int bestellnummer;
        Bestellung next;
        Artikel head;
        public Bestellung(){
            bestellnummer++;
            head=null;
        }

        public int getBestellnummer() {
            return bestellnummer;
        }
        public void einfuegen(Artikel artikel){
            if(head==null){
                head=artikel;
                artikel.next=null;
            }
            else{
                Artikel temp=head;
                head=artikel;
                head.next=temp;
            }
        }
        public boolean delete(String name){return true;}
    }
    public class Artikel{
        String name;
        Artikel next;
        int artikelNummer;
        public Artikel(String name){
            artikelNummer++;
            this.name=name;
        }
        public int getArtikelNummer(){
            return artikelNummer;
        }

        public String getName() {
            return name;
        }
    }
    public class Kunde{
        Bestellung head;
        public Bestellung suche(String artikelname){
            Bestellung temp =head;
            while(temp.next!=null){
                Artikel tempa = temp.head;
                while(tempa.next!=null){
                    if(tempa.getName().equals(artikelname))return temp;
                    tempa=tempa.next;
                }
                temp=temp.next;
            }
            return null;
        }
    }
}
