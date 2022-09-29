public class teste{
	public static int states = 0;

	public static void main(String[] args) {
		//tuple(8, "");
		//permutation(2, "");
		combination(2, "");
		System.out.println("States = "+states);
	}

	public static void combination(int n, String s){
		if (n == 0){
			states++;
			System.out.println(s);
		} else{
			int l = s.length();
			if(l == 0 || s.charAt(l-1) < 'A'){ combination(n - 1, s + "A"); }
			if(l == 0 || s.charAt(l-1) < 'B'){ combination(n - 1, s + "B"); }
			if(l == 0 || s.charAt(l-1) < 'C'){ combination(n - 1, s + "C"); }
			if(l == 0 || s.charAt(l-1) < 'D'){ combination(n - 1, s + "D"); }
		}
	}

	public static void permutation(int n, String s){
		if (n == 0){
			states++;
			System.out.println(s);
		}
		else{
			if (!s.contains("A")){ permutation(n - 1, s + "A"); }
			if (!s.contains("B")){ permutation(n - 1, s + "B"); }
			if (!s.contains("C")){ permutation(n - 1, s + "C"); }
			if (!s.contains("D")){ permutation(n - 1, s + "D"); }
		}
	}

	public static void tuple(int n, String s){
		if (n == 0){
			states++;
			System.out.println(s);
		} else {
			tuple(n - 1, s + "A");
			tuple(n - 1, s + "B");
			tuple(n - 1, s + "C");
			tuple(n - 1, s + "D");
		}
	}
}