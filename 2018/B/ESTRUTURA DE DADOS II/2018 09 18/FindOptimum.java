public class FindOptimum{
	public static int states = 0;
	public static double best_val = 100;
	public static String best_str = "";

	public static void main(String[] args) {
		tuple(6, "");
		System.out.println("States = " 		+ states);
		System.out.println("Best_val = " 	+ best_val);
		System.out.println("Best_str = " 	+ best_str);
	}

	public static double evaluate(String s){
		double sum = 0;
		for (char c : s.toCharArray()){
			if (c == 'A') { sum += 0.3; }
			if (c == 'B') { sum += 1.2; }
			if (c == 'C') { sum += 2.5; }
			if (c == 'D') { sum += 0.9; }			
		}
		return Math.abs(sum - 10);
	}

	public static boolean tuple(int n, String s){
		if (n == 0){
			states++;
			double v = evaluate(s);
			if( v < best_val){
				best_val = v;
				best_str = s;
			}
		} else{
			tuple(n - 1, s + "A");
			tuple(n - 1, s + "B");
			tuple(n - 1, s + "C");
			tuple(n - 1, s + "D");
		}
		return false;
	}
}