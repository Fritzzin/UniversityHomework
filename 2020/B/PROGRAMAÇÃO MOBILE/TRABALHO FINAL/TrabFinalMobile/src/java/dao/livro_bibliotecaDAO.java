/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import classes.biblioteca;
import classes.livro;
import classes.livro_biblioteca;
import classes.localizacao;
import java.sql.ResultSet;
import java.sql.Statement;
import json.livrosBiblioteca;

/**
 *
 * @author Lucas
 */
public class livro_bibliotecaDAO {

    ResultSet resultadoQ = null;

    public livrosBiblioteca buscaLivros(String filtro) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            livrosBiblioteca lb = new livrosBiblioteca();
            String sql = "SELECT l.id \"idLocalizacao\", l.latitude, l.longitude,  \n"
                    + "b.id \"idBiblioteca\", b.nome \"nomeBiblioteca\",\n"
                    + "lb.id \"idLivroBiblioteca\", lb.disponivel,\n"
                    + "li.id \"idLivro\", li.nome \"nomeLivro\", li.autor \n"
                    + "FROM localizacao l, biblioteca b, livro_biblioteca lb, livro li\n"
                    + "WHERE l.id = b.localizacao_id\n"
                    + "AND b.id = lb.biblioteca_id\n"
                    + "AND lb.livro_id = li.id \n"
                    + "AND (lower(li.nome) LIKE lower('%" + filtro + "%') OR lower(li.autor) LIKE lower('%" + filtro + "%'))";
            System.out.println(sql);
            resultadoQ = st.executeQuery(sql);
            
            while (resultadoQ.next()) {
                livro_biblioteca l = new livro_biblioteca();
                l.setId(resultadoQ.getInt("idLivroBiblioteca"));
                l.setBiblioteca(new biblioteca(resultadoQ.getInt("idBiblioteca"), 
                        resultadoQ.getString("nomeBiblioteca"), 
                        new localizacao(resultadoQ.getInt("idLocalizacao"), 
                                resultadoQ.getDouble("latitude"), resultadoQ.getDouble("longitude"))));
                l.setLivro(new livro(resultadoQ.getInt("idLivro"), resultadoQ.getString("nomeLivro"), 
                        resultadoQ.getString("autor")));
                l.setStatus(resultadoQ.getBoolean("disponivel"));
                lb.add(l);
            }
            return lb;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
