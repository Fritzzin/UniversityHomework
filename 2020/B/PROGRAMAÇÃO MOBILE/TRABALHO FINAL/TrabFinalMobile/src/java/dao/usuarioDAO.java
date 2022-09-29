/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import apoio.Encriptar;
import classes.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lucas
 */
public class usuarioDAO {

    ResultSet resultadoQ = null;

    public usuario salvar(usuario u) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "INSERT INTO usuario VALUES("
                    + "DEFAULT,"
                    + "'" + u.getLogin() + "',"
                    + "'" + u.getSenha() + "'"
                    + ")";

            st.executeUpdate(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            resultadoQ = st.getGeneratedKeys();
            resultadoQ.next();
            int id = resultadoQ.getInt(1);
            u.setId(id);

            return u;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public usuario validaUsuario(usuario u) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM usuario "
                    + "WHERE login = '"+u.getLogin()+"' "
                    + "AND senha = '"+u.getSenha()+"';";
            System.out.println(sql);
            resultadoQ = st.executeQuery(sql);

            resultadoQ.next();
            int idUsuario = resultadoQ.getInt("id");
            String login = resultadoQ.getString("login");
            String senha = resultadoQ.getString("senha");

            u.setId(idUsuario);

            return u;
        } catch (Exception e) {
            return null;
        }
    }
    
}
