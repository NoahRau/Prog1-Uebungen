package Lektion13;

public class Schachbrett {
        Turm t;
        //markiert alle bedrohten Felder
        boolean[][] brett = new boolean[8][8];
        public void setzeTurm(int x, int y){
                if(x>7||x<0)x=3;
                if(y>7||y<0)y=3;
                System.out.println(x+" "+y);
                t = new Turm(x,y);
                for(int i = 0;i<brett.length;i++){
                        for(int z = 0;z<brett[i].length;z++){
                                if(((i)== t.getX()||(z==t.getY())))brett[i][z]=true;

                        }
                }
        }

        @Override
        public String toString(){
                String Ausgabe ="";
                for(int i = 0;i<brett.length;i++){
                        Ausgabe+="\r\n";
                        for(int z = 0;z<brett[i].length;z++){
                                if(brett[i][z])Ausgabe+=" X ";
                                else Ausgabe+=" O ";
                        }

                }
                return Ausgabe;
        }
        private class Turm{
                int x;
                int y;
                public Turm(int x,int y){
                        this.y=y;
                        this.x=x;
                }
                public int getX() {
                        return x;
                }

                public int getY() {
                        return y;
                }
        }
        public static void main(String[] args){
                Schachbrett s = new Schachbrett();
                s.setzeTurm(0, 7);
                System.out.println(s);
        }
}
