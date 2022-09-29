/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import classes.localizacao;
import classes.loja;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class lojaDAO {

    ResultSet resultadoQ = null;

    public ArrayList<loja> buscaLojas() {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ArrayList<loja> arrayLoja = new ArrayList<>();
            String sql = "SELECT l.id, l.nome, l.localizacao_id, lc.latitude, lc.longitude\n"
                    + "FROM loja l, localizacao lc WHERE l.localizacao_id = lc.id";
            System.out.println(sql);
            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                loja l = new loja(resultadoQ.getInt("id"), resultadoQ.getString("nome"),
                        new localizacao(resultadoQ.getInt("localizacao_id"), resultadoQ.getDouble("latitude"), resultadoQ.getDouble("longitude")));
                
                arrayLoja.add(l);
            }
            return arrayLoja;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
