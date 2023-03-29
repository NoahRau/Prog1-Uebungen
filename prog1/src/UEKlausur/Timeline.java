package UEKlausur;

public class Timeline {
    private class Post{
        String absender;
        String empfaenger;
        String text;
        Post next;
        private Post(String absender,String empfaenger,String text){
            this.absender=absender;
            this.empfaenger=empfaenger;
            this.text=text;
        }
        @Override
        public String toString(){
            return absender+"->"+empfaenger+"\n\r"+text;
        }
    }
    Post head;

    public Timeline(){
        head=null;
    }

    public void fuegePostein(String absender,String empfaenger,String text){
        if(head==null){
            head=new Post(absender,empfaenger,text);
        }
        else {
            Post temp=head;
            head=new Post(absender,empfaenger,text);
            head.next=temp;
        }
    }
    public String gibAus(){
        String ausgabe="";
        Post temp=head;
        while (temp!=null){
            ausgabe+=temp+"\n\r";
            temp=temp.next;
        }
        return ausgabe;
    }

    public static void main(String[] args){
        Timeline s=new Timeline();
        s.fuegePostein("Alice","Bob","Frohe Weihnachten!");
        s.fuegePostein("Bob","Alice","Guten Rutsch!");
        s.fuegePostein("Alice","Bob","Frohes Neues!");
        System.out.println(s.gibAus());
    }
}
