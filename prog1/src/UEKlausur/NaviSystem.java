package UEKlausur;

public class NaviSystem {
    private class Zielort{
        int distanz;
        String name;
        Zielort next;
        Zielort prev;

        public Zielort(String name, int distanz){
            this.name=name;
            this.distanz=distanz;
        }

        public int getDistanz() {
            return distanz;
        }

        public String getName() {
            return name;
        }
        @Override
        public String toString(){
            return "Ortsname: "+getName()+" Distanz "+getDistanz()+" kmq";
        }

            }

        Zielort head;
        public NaviSystem(){
            head=null;
        }
        public void einfuegen(String name, int distanz){

            if(head==null){
                head=new Zielort(name,distanz);
                return;

            }
            else {
                Zielort temp=head;
                head=new Zielort(name,distanz);
                head.next = temp;
                head.next.prev =head;
            }
        }
        public int gesamtStrecke(){
            Zielort temp = head;
            int strecke=0;
            while(temp!=null){
                strecke+= temp.getDistanz();
                temp=temp.next;}
            return strecke;
        }
        public String route(){
            String rueckgabe ="";
            Zielort temp = head;
            while(temp.next!=null)temp=temp.next;
            while(temp!=null){
                if(temp.next!=null)rueckgabe+=" -> ";
                rueckgabe+= temp.getName()+"("+temp.getDistanz()+")";
                temp=temp.prev;

            }
            return rueckgabe;

        }

    public static void main(String[] args){
        NaviSystem s = new NaviSystem();
        s.einfuegen("Wuerzburg",0);
        s.einfuegen("Kitzingen",19);
        s.einfuegen("Neustadt",42);
        s.einfuegen("Nuernberg",49);
        System.out.println(s.gesamtStrecke());
        System.out.println(s.route());
    }
        }
