public class EmpacotamentoState{

    /*public char[][] m = {{'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'}};*/

    /*public char[][] m = {{'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'}};*/

    /*public char[][] m = {{'-','x','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','x','-'},
                         {'-','-','-','-','-','x'}};*/

    /*public char[][] m = {{'-','-','X','-','-'},
                         {'-','X','X','X','-'},
                         {'-','X','-','X','X'},
                         {'-','-','-','-','-'},
                         {'X','X','X','-','-'}};*/

    /*public char[][] m = {{'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'},
                         {'-','-','-','-','-','-'}};*/

    public char[][] m;

    public EmpacotamentoState(EmpacotamentoState t) {
        this.m = new char[t.m.length][t.m[0].length];

        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[0].length; col++){
                this.m[row][col] = t.m[row][col];
            }
        }
    }

    public EmpacotamentoState(int r, int c){
        this.m = new char[r][c];
        
        for(int row = 0; row < r; row++){
            for(int col = 0; col < c; col++){
                this.m[row][col] = '-';
            }
        }
    }

    private boolean colIsValid(int col) {
        for (int row = 0; row < m.length; row++) {
            if( this.m[row][col] == '-') { return false;}
        }

        return true;
    }

    private boolean rowIsValid(int row) {
        for (int col = 0; col < m[0].length; col++) {
            if( this.m[row][col] == '-') { return false;}
        }

        return true;
    }

    public boolean isValid() {
        boolean valid = false;

        for(int i = 0; i < m.length; i++) {
            if(rowIsValid(i)){
                valid = true;
            } else {
                valid = false;
            }
        }

        for(int i = 0; i < m[0].length; i++) {
            if(colIsValid(i)){
                valid = true;
            } else {
                valid = false;
            }
        }

        return valid;
    }

    public String toString() {
        String s = "";
        for(int row = 0; row < m.length; row++) {
            for(int col = 0; col < m[0].length; col++) {
                s += m[row][col] + " | ";
            }
            s += "\n";
        }
        return s;
    }
}