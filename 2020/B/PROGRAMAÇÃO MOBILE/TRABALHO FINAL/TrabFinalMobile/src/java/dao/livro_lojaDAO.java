/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import classes.biblioteca;
import classes.livro;
import classes.livro_loja;
import classes.localizacao;
import classes.loja;
import java.sql.ResultSet;
import java.sql.Statement;
import json.livrosLoja;

/**
 *
 * @author Lucas
 */
public class livro_lojaDAO {

    ResultSet resultadoQ = null;

    public livrosLoja buscaLivros(String filtro) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            livrosLoja ll = new livrosLoja();
            String sql = "SELECT l.id \"idLocalizacao\", l.latitude, l.longitude,\n"
                    + "lj.id \"idLoja\", lj.nome \"nomeLoja\",\n"
                    + "ll.id \"idLivroLoja\", ll.valor,\n"
                    + "lv.id \"idLivro\", lv.nome \"nomeLivro\", lv.autor\n"
                    + "FROM localizacao l, loja lj, livro_loja ll, livro lv\n"
                    + "WHERE l.id = lj.localizacao_id\n"
                    + "AND lj.id = ll.loja_id\n"
                    + "AND lv.id = ll.livro_id\n"
                    + "AND (lower(lv.nome) LIKE lower('%"+filtro+"%') OR lower(lv.autor) LIKE lower('%"+filtro+"%'))";
            System.out.println(sql);
            resultadoQ = st.executeQuery(sql);

            while (resultadoQ.next()) {
                livro_loja l = new livro_loja();
                l.setId(resultadoQ.getInt("idLivroLoja"));
                l.setLoja(new loja(resultadoQ.getInt("idLoja"), resultadoQ.getString("nomeLoja"),
                 new localizacao(resultadoQ.getInt("idLocalizacao"), resultadoQ.getDouble("latitude"), 
                         resultadoQ.getDouble("longitude"))));
                l.setLivro(new livro(resultadoQ.getInt("idLivro"), resultadoQ.getString("nomeLivro"),
                        resultadoQ.getString("autor")));
                l.setValor(resultadoQ.getDouble("valor"));
                ll.add(l);
            }
            return ll;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
