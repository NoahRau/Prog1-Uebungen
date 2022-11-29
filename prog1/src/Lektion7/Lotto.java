package Lektion7;

public class Lotto {
    public static int Neuezahl(){
        return ((int)(Math.random()*49+1));
    }

    public static void main(String[] args){

        int[] Lotto = new int[6];

        for(int i = 0;i <6;i++ ){
            Lotto[i] = Neuezahl();
            for(int y = 0;y <6;y++ ){
                if((Lotto[y] == Lotto[i]) && !(i==y) ){
                    Lotto[i]= Neuezahl();
                }

            }
            System.out.println(Lotto[i]);
        }

    }


        }
