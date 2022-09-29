/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import classes.biblioteca;
import classes.localizacao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class bibliotecaDAO {
    ResultSet resultadoQ = null;

    public ArrayList<biblioteca> buscaBiblotecas() {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            ArrayList<biblioteca> arrayBiblioteca = new ArrayList<>();
            String sql = "SELECT l.id, l.nome, l.localizacao_id, lc.latitude, lc.longitude\n"
                    + "FROM biblioteca l, localizacao lc WHERE l.localizacao_id = lc.id";
            System.out.println(sql);
            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                biblioteca l = new biblioteca(resultadoQ.getInt("id"), resultadoQ.getString("nome"),
                        new localizacao(resultadoQ.getInt("localizacao_id"), resultadoQ.getDouble("latitude"), resultadoQ.getDouble("longitude")));
                
                arrayBiblioteca.add(l);
            }
            return arrayBiblioteca;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
