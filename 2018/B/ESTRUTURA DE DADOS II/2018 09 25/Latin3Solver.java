public class Latin3Solver{
	public static void main(String[] args) {
		solve(new Latin3State());
	}

	public static void solver(final Latin3State state){
		boolean found = false;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (state.m[row][col] == '-'){
					found = true;
					break;
				}
				if (found == true) { break; }
			} 
		}

		if (found == false) {
			if (state.isValid()){
				System.out.println("Solution Found");
			}
		} else {
			// COPIAR state para state_a e jogar em solve(state_a)
			// COPIAR state para state_b e jogar em solve(state_b)
			// COPIAR state para state_c e jogar em solve(state_c)
		}
	}
}