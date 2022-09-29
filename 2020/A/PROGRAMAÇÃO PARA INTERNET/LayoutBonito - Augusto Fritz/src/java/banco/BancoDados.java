package banco;

import java.sql.*;

public class BancoDados {

    private Connection conexao = null;

    public BancoDados() {
        String nomeDriver = "org.postgresql.Driver";
        String localBancoDados = "jdbc:postgresql://localhost:5432/bancodados";
        String usuario = "juca";
        String senha = "123";

        try {
            Class.forName(nomeDriver).newInstance();
            conexao = DriverManager.getConnection(localBancoDados, usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conexao;
    }

    public void executaSQL(String sql) {

    }

    public ResultSet consulta(String sql) {
        ResultSet rs = null;
        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public boolean validaLogin(String usuario, String senha) {
        boolean resp = true;

        ResultSet res = consulta(
                "SELECT usuario, senha "
                + "FROM usuarios "
                + "WHERE usuario = '" + usuario + "' AND "
                + "senha = '" + senha + "'"
        );

        try {
            resp = res.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resp;
    }

}
