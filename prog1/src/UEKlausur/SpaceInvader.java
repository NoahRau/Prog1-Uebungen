package UEKlausur;

import java.util.Scanner;

public class SpaceInvader {
    boolean[][] spiel = new boolean[4][8];

    public void spielInit(){
        int random = ((int)(Math.random()*4+1));
        for(int i =0;i< spiel.length;i++){
            for(int y=0;y<spiel[i].length;y++){
                if(i==0)spiel[i][y]=true;
                if((i== spiel.length-1)&&(y==random))spiel[i][y]=true;
            }
        }
    }

    @Override
    public String toString(){
        String Ausgabe = "";
        for(int i =0;i< spiel.length;i++){
            Ausgabe+="\r\n";
            for(int y=0;y<spiel[i].length;y++){
                if(i==0&&spiel[i][y])Ausgabe+=" O ";
                if(!spiel[i][y])Ausgabe+="   ";
                if((i==3)&&spiel[i][y])Ausgabe+=" V ";

            }
        }
        return Ausgabe;
    }
    public void move(char ad) {
        for (int i = 0; i < spiel[3].length; i++) {

            if (spiel[3][i] &&( i != 7)&&(ad=='d')) {
                spiel[3][i] = false;
                spiel[3][i + 1] = true;
                break;
            }

            if(spiel[3][i]&&(i!=0)&&(ad=='a')){
                spiel[3][i]=false;
                spiel[3][i-1]=true;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SpaceInvader spiel = new SpaceInvader();
        spiel.spielInit();
        char eingabe;
        try{
            do{
                System.out.println(spiel);

                eingabe= scanner.nextLine().charAt(0);
                if(eingabe=='a'||eingabe=='d'){
                    spiel.move(eingabe);

                }
            }while(eingabe!='x');



        }catch(Exception e){}
    }

}
