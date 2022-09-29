//	Optimum
//	
// 	Achar solução que demore menos que 80 minutos

public class exer
{
	public static int states = 0;
	public static double best_val = 1000;
	public static String best_str = "";

	public static void main(String[] args) {
		tuple(6, "");
		//permutation(6, "");
		System.out.println("states=" + states);
		System.out.println("best_val=" + best_val);
		System.out.println("best_str=" + best_str);
	}

	public static double evaluate(String s) {
		double sum = 0;
		for (char c : s.toCharArray()) {
			if (c == '0') { sum += ; }
			if (c == '1') { sum += ; }
			if (c == '2') { sum += ; }
			if (c == '3') { sum += ; }
			if (c == '4') { sum += ; }
			if (c == '5') { sum += ; }
		}
		return Math.abs(sum);
	}

	public static void permutation(int n, String s) {
		if (n == 0) {
			states++;
			double v = evaluate(s);
			if (v < best_val) {
				best_val = v;
				best_str = s;
			}
			System.out.println(s);
		}
	  	else {
  			if (! s.contains("0")) { permutation(n - 1, s + "0"); }
  			if (! s.contains("1")) { permutation(n - 1, s + "1"); }
  			if (! s.contains("2")) { permutation(n - 1, s + "2"); }
	  		if (! s.contains("3")) { permutation(n - 1, s + "3"); }
	  		if (! s.contains("4")) { permutation(n - 1, s + "4"); }
	  		if (! s.contains("5")) { permutation(n - 1, s + "5"); }
		}
	}
}