// 10 Itens: 5; 17; 3; 21; 8; 12; 4; 9; 15; 16;
// Caixa possui 25 volume

public class PackageSolution
{
	public static int 		states = 0;
	public static int 		best_val = 1000;
	public static String 	best_str = "";


	public static void main(String[] args) {
		permutation(10, "");

		System.out.println("states 	  = "	+ states);
		System.out.println("Nº of boxes = "	+ best_val);
		System.out.println("Order 	  = "	+ best_str);
	}

	public static int evaluate(String s){
		int boxes = 1, current = 0, item = 0;
		for (char c : s.toCharArray()) {
			if (c == 'A') { item =  5;}
			if (c == 'B') { item = 17;}
			if (c == 'C') { item =  3;}
			if (c == 'D') { item = 21;}
			if (c == 'E') { item =  8;}
			if (c == 'F') { item = 12;}
			if (c == 'G') { item =  4;}
			if (c == 'H') { item =  9;}
			if (c == 'I') { item = 15;}
			if (c == 'J') { item = 16;}
			if (current + item <= 25){ current += item; }
			else{ boxes++; current = item; }
		}
		return boxes;
	}

	public static void permutation(int n, String s) {
		if (n == 0) {
			states++;
			int v = evaluate(s);
			if (v <= best_val){
				System.out.println(s + " boxes : " + v);
				best_val = v;
				best_str = s;
			}
		}
	  	else {
  			if (! s.contains("A")) { permutation(n - 1, s + "A");}
  			if (! s.contains("B")) { permutation(n - 1, s + "B");}
  			if (! s.contains("C")) { permutation(n - 1, s + "C");}
  			if (! s.contains("D")) { permutation(n - 1, s + "D");}
  			if (! s.contains("E")) { permutation(n - 1, s + "E");}
  			if (! s.contains("F")) { permutation(n - 1, s + "F");}
  			if (! s.contains("G")) { permutation(n - 1, s + "G");}
  			if (! s.contains("H")) { permutation(n - 1, s + "H");}
  			if (! s.contains("I")) { permutation(n - 1, s + "I");}
  			if (! s.contains("J")) { permutation(n - 1, s + "J");}
		}
	}
}