package Lektion11;

public class Tictactoe3d {

    public static boolean random(){
        if(Math.random()*10>5)return true;
        else return false;
    }

    public static void main(String[] args){

        boolean[][][] tictac = new boolean[3][3][3];
        String ausgabe = "";
        for(int i = 0;i<tictac.length;i++){
            ausgabe +="------------------------------\n";
            for(int y = 0;y<tictac[i].length;y++){
                for(int x = 0;x<tictac[i][y].length;x++){
                    tictac[i][x][y]=random();
                    if(tictac[i][x][y])ausgabe+="x";
                    else ausgabe+="o";
                    if(x<2)ausgabe+="|";
                }
                ausgabe+="\n\r";
            }

        }
        System.out.println(ausgabe);
    }




}
