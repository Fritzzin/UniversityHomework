/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classes.livro;
import classes.livro_loja;
import com.google.gson.Gson;
import dao.livro_bibliotecaDAO;
import dao.livro_lojaDAO;
import json.livrosBiblioteca;
import json.livrosLoja;

/**
 *
 * @author Lucas
 */
public class NewClass {
    public static void main(String[] args) {
        livro_lojaDAO lld = new livro_lojaDAO();
        livrosLoja ll = lld.buscaLivros("ca");
        System.out.println(new Gson().toJson(ll));
        
        System.out.println(new Gson().toJson(new livro(0, "Nome livro", "Nome autor")));
    }
}
