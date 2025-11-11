
public class Cheers {
        public static void main(String[] args) {
	String name = args[0];
        int time = Integer.parseInt(args[1]);
        String nameB = name.toUpperCase();
        String swi = "AEFHILMNORSX";
        for ( int i = 0; i < nameB.length(); i ++) {
            char n = nameB.charAt(i);
            if (swi.indexOf (n) == -1 ) {
            System.out.println( "Give me a  " + n + ": " + n + "!");
              }   else {
            System.out.println("Give me an " + n + ": " + n + "!");
              } }
        System.out.println("What does that spell?");
        for ( int t  = 0; t < time; t ++)
        System.out.println(nameB + "!!!" );
        
}
}