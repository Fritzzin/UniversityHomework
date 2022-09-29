/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import classes.livro_loja;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class livrosLoja {
    ArrayList<livro_loja> ArrayLivroLoja = new ArrayList<>();
    
    public void add(livro_loja ll){
        ArrayLivroLoja.add(ll);
    }
}
