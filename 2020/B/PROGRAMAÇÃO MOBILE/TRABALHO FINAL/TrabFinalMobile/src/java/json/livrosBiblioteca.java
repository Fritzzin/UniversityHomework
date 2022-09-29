/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import classes.livro_biblioteca;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class livrosBiblioteca {
    ArrayList<livro_biblioteca> arrayLivrosBiblioteca = new ArrayList<>();
    
    public void add(livro_biblioteca lb){
        arrayLivrosBiblioteca.add(lb);
    }
    
}
