package Lektion8;

public class einfacherRechner {

    public static void main(String[] args){

        if ((args.length <= 3) && ((args[args.length-1].equals("+")) || (args[args.length-1].equals("-"))))
        {
            System.out.println("Geben sie mind zwei Parameter und + || - zum Start mit!");
            System.exit(0);
        }

        String Ausgabe = "="+args[0];
        int Rechenwert = Integer.valueOf(args[0]);


        for (int i = 1; i< args.length-1;i++){

            if (args[args.length - 1].equals("-")) {

                Ausgabe += "-"+args[i];
                Rechenwert-=Integer.valueOf(args[i]);

            }

            else {
                Ausgabe += "+"+args[i];
                Rechenwert+=Integer.valueOf(args[i]);
            }

        }
        System.out.println(Rechenwert + Ausgabe);

    }

}
