public class EmpacotamentoSolver{
    public static int completed_states, partial_states, solutions;
    public static void main(String[] args) {
        //EmpacotamentoState start = new EmpacotamentoState();
        EmpacotamentoState start = new EmpacotamentoState(4,3);

        solve(start);

        System.out.println("complete states = " + completed_states);
        System.out.println("partial states = "  + partial_states);
        System.out.println("solutions = "       + solutions);
    }

    public static boolean solve(final EmpacotamentoState state) {
        boolean found = false;
        int row = 0, col = 0;

        for (row = 0; row < state.m.length; row++) {
            for (col = 0; col < state.m[0].length; col++) {
                    if(state.m[row][col] == '-') {
                        found = true;
                        break;
                    }
            }
            if (found) { break; }
        }

        if (!found) {
            completed_states++;

            if (state.isValid()) {
                solutions++;
                System.out.println(state);
                //return true;
            }
        }
        else{
            partial_states++;
            System.out.println(state);

            // A
            // AA
            EmpacotamentoState ea = new EmpacotamentoState(state);
            if ((row + 1) < state.m.length && (col + 1) < state.m[0].length  &&
                ea.m[row]   [col]       ==  '-' &&
                ea.m[row+1] [col]       ==  '-' &&
                ea.m[row+1] [col+1]     ==  '-') {
                    
                    ea.m[row]   [col]    = 'a';
                    ea.m[row+1] [col]    = 'a';
                    ea.m[row+1] [col+1]  = 'a';

                    if(solve(ea) == true) { return true; }
            }
            
            
            // BB
            //  B
            EmpacotamentoState eb = new EmpacotamentoState(state);
            if ((row + 1) < state.m.length && (col + 1) < state.m[0].length &&
                eb.m[row]   [col]       == '-' &&
                eb.m[row]   [col+1]     == '-' &&
                eb.m[row+1] [col+1]     == '-') {

                    eb.m[row]   [col]    = 'b';
                    eb.m[row]   [col+1]  = 'b';
                    eb.m[row+1] [col+1]  = 'b';

                    if(solve(eb) == true) { return true; }
            }
            

            // CC
            // C
            EmpacotamentoState ec = new EmpacotamentoState(state);
            if ((row + 1) < state.m.length && (col + 1) < state.m[0].length &&
                ec.m[row]   [col]       == '-' &&
                ec.m[row]   [col+1]     == '-' &&
                ec.m[row+1] [col]       == '-') {
                    
                    ec.m[row]   [col]    = 'c';
                    ec.m[row]   [col+1]  = 'c';
                    ec.m[row+1] [col]    = 'c';

                    if(solve(ec) == true) { return true; }
            }
            

            //  D
            // DD
            EmpacotamentoState ed = new EmpacotamentoState(state);
            if ((row + 1) < state.m.length && (col -1) >= 0 &&
                ed.m[row]   [col]       == '-' &&
                ed.m[row+1] [col]       == '-' &&
                ed.m[row+1] [col-1]     == '-') {

                    ed.m[row]   [col]    = 'd';
                    ed.m[row+1] [col]    = 'd';
                    ed.m[row+1] [col-1]  = 'd';

                    if(solve(ed) == true) { return true; }
            }
            
        }
        return false;
    }
}