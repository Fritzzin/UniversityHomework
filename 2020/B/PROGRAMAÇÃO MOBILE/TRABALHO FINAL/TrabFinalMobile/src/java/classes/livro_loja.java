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
public class livro_loja {
    int id;
    livro livro;
    loja loja;
    double valor;

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

    public loja getLoja() {
        return loja;
    }

    public void setLoja(loja loja) {
        this.loja = loja;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
