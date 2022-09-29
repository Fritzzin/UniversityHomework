/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Lucas
 */
public class livro_biblioteca {
    int id;
    livro livro;
    biblioteca biblioteca;
    boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public livro getLivro() {
        return livro;
    }

    public void setLivro(livro livro) {
        this.livro = livro;
    }

    public biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
