public class Combinatorics{
	public static void binary(int n, String s){
		// BASE
		if (n == 0){ System.out.println(s); }
		// GENERAL
		else{			
			binary(n - 1, s + "0");
			binary(n - 1, s + "1");
		}
	}

	public static void abc(int n, String s){
		// BASE
		if (n == 0){ System.out.println(s); }
		// GENERAL
		else{			
			abc(n - 1, s + "A");
			abc(n - 1, s + "B");
			abc(n - 1, s + "C");
		}
	}

	public static void abcde(int n, String s){
		// BASE
		if (n == 0){
			int exit = 0;
			try{
				Process p = Runtime.getRuntime().exec("unzip -P "+s+" -t hidden.zip");
				p.waitFor();
				exit = p.exitValue();

				if(exit == 0){
					System.out.println("ACHEI! A senha é: "+s);
				}
			} catch(Exception e){
				System.out.println("ERRO!");
			}
			
		}

		// GENERAL
		else{			
			abcde(n - 1, s + "a");
			abcde(n - 1, s + "b");
			abcde(n - 1, s + "c");
			abcde(n - 1, s + "d");
			abcde(n - 1, s + "e");
		}
	}

	public static void main(String[] args) {
		//binary(4, "");
		//abc(4,"");
		abcde(5,"");
	}
}