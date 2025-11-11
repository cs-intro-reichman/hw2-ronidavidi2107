
public  class  TestRandom {
	public static void main(String[]  args) {
	int N = Integer.parseInt(args[0]);
	int Big = 0;
	int Small = 0;
	for (int i = 1; i <= N ; i++ ) {
		double R = Math.random();
		if (R > 0.5) Small = Small + 1;  
		else Big = Big + 1;
	}
    System.out.println("> 0.5: " + Big + " times");
	System.out.println("<= 0.5: " + Small + " times");
	double S = (double) Big / Small ;
	if (Big>0 && Small>0) {
		System.out.println("Ratio: " + S);

	}

	}
}
