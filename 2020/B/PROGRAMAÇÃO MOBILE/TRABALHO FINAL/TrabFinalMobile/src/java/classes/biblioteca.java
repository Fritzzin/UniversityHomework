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
public class biblioteca {
    int id;
    String nome;
    localizacao localizacao;

    public biblioteca(int id, String nome, localizacao localizacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(localizacao localizacao) {
        this.localizacao = localizacao;
    }
    
    
}
