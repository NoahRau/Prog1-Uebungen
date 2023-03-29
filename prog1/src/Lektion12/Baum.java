package Lektion12;

public class Baum {
    private class Knoten{
        Knoten right;
        Knoten left;
        String Wort;
        String Bedeutung;
        public Knoten(String Wort,String Bedeutung){
            this.Bedeutung=Bedeutung;
            this.Wort=Wort;
        }
        public String getWort(){return Wort;}
        public String getBedeutung(){return Bedeutung;}
    }
    Knoten root;
    
    public void einfuegen(String Wort,String Bedeutung) {
        Knoten neu = new Knoten(Wort,Bedeutung);
        if (root == null) root = neu;
        else einfuegen(root, neu);
    }
    private void einfuegen(Knoten temp, Knoten neu) {
        if (neu.getWort().compareTo(temp.getWort()) < 0) {
            if (temp.left == null) temp.left = neu;
            else einfuegen(temp.left, neu);
        }
        else {
            if (temp.right == null) temp.right = neu;
            else einfuegen(temp.right, neu);
        }
    }
    public void baumAusgeben()
    {
        baumAusgeben(root);
    }
    private void baumAusgeben(Knoten temp)
    {
        if (temp.left != null) baumAusgeben(temp.left);
        System.out.println(temp.getWort()+"      "+temp.getBedeutung());
        if (temp.right != null) baumAusgeben(temp.right);
    }
    public String baumSuche(String Wort){
        return baumSuche(Wort, root);
    }

    private String baumSuche(String Wort, Knoten temp){
        if(temp == null) return null;
        if(Wort.compareTo(temp.getWort()) < 0){
            return baumSuche(Wort, temp.left);
        }else if(Wort.compareTo(temp.getWort()) > 0){
            return baumSuche(Wort, temp.right);
        }else{
            return temp.getBedeutung();
        }
    }
    public void baumDelete(String Wort){
        root = baumDelete(Wort, root);
    }

    private Knoten baumDelete(String Wort, Knoten temp){
        if(temp == null) return null;
        if(Wort.compareTo(temp.getWort()) < 0){
            temp.left = baumDelete(Wort, temp.left);
        }else if(Wort.compareTo(temp.getWort()) > 0){
            temp.right = baumDelete(Wort, temp.right);
        }else{
            if(temp.left == null) return temp.right;
            else if(temp.right == null) return temp.left;
            temp.Wort = minValue(temp.right);
            temp.right = baumDelete(temp.Wort, temp.right);
        }
        return temp;
    }

    private String minValue(Knoten temp){
        String minv = temp.Wort;
        while(temp.left != null){
            minv = temp.left.Wort;
            temp = temp.left;
        }
        return minv;
    }



    public static void main(String[] args) {
        Baum baum = new Baum();
        baum.einfuegen("Wort1", "Bedeutung1");
        baum.einfuegen("Wort2", "Bedeutung2");
        baum.einfuegen("Wort3", "Bedeutung3");
        baum.einfuegen("Wort4", "Bedeutung4");
        baum.einfuegen("Wort5", "Bedeutung5");

        // Testen Sie die Ausgabe des Baums
        baum.baumAusgeben();
        // Testen Sie das Suchen eines Knotens
        System.out.println(baum.baumSuche("Wort3"));
        // Testen Sie das Löschen eines Knotens
        baum.baumDelete("Wort3");
        System.out.println(baum.baumSuche("Wort3"));
        System.out.println(baum.baumSuche("Wort4"));
        // Testen Sie erneut die Ausgabe des Baums, um sicherzustellen, dass der Knoten gelöscht wurde
        baum.baumAusgeben();
    }
}
