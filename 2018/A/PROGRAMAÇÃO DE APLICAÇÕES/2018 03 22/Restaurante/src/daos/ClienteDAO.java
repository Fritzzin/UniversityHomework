/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import apoio.ConexaoBD;
import apoio.IDAO_T;
import entidades.Cliente;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author augusto.fritz
 */
public class ClienteDAO implements IDAO_T<Cliente> {

    @Override
    public String salvar(Cliente o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "INSERT INTO cliente VALUES ("
                    + "DEFAULT, "
                    + "'" + o.getNome() + "', "
                    + "'" + o.getSobrenome() + "',"
                    + "'" + o.getTelefone() + "'"
                    + ")";

            System.out.println("sql: " + sql);

            int resultado = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro salvar Cliente = " + e);
            return e.toString();
        }

    }

    @Override
    public String atualizar(Cliente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
