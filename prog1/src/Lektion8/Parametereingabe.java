package Lektion8;

public class Parametereingabe {

    public static void main(String[] args){
        if (args.length !=2)
        {
            System.out.println("Geben sie zwei Parameter zum Start mit!");
            System.exit(0);
        }
        System.out.println(args[0]+"*"+args[1]+"="+(Integer.valueOf(args[1])* Integer.valueOf(args[0])));

    }
}
