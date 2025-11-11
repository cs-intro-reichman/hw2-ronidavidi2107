
public class Collatz {
	public static void main(String args[]) {
	int N = Integer.parseInt(args[0]);
	String Mood = args[1];
	String Verbose = "v";
	String Concise = "c";
	if (Verbose.equals(Mood)) {
	for ( int seed = 1; seed <= N ; seed ++) {
		int Current = seed;
		int step = 1;
		System.out.print(Current);
		while (Current != 1 || step == 1) {
			if (Current%2 == 0) {
				Current = Current/2 ;
			} else {
				Current = Current*3 +1;
			}
			System.out.print(" "+Current);
			step ++;

		}    System.out.println("(" + step + ")");
		
	} System.out.println( "Every one of the first " + N +" hailstone sequences reached 1.");

	}
	if (Concise.equals(Mood)) {
		System.out.println( "Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
}