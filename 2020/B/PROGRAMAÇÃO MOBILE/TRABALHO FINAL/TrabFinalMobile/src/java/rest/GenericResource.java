/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import classes.livro;
import classes.usuario;
import com.google.gson.Gson;
import dao.bibliotecaDAO;
import dao.livro_bibliotecaDAO;
import dao.livro_lojaDAO;
import dao.lojaDAO;
import dao.usuarioDAO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import json.BibliotecasLojas;
import json.livrosBiblioteca;
import json.livrosLoja;

/**
 * REST Web Service
 *
 * @author Lucas
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @PUT
    @Path("cadastra")
    @Consumes(MediaType.APPLICATION_JSON)
    public String cadastraUser(String content) {
        Gson g = new Gson();
        usuario u = g.fromJson(content, usuario.class);
        usuarioDAO ud = new usuarioDAO();
        u = ud.salvar(u);
        return g.toJson(u);
    }
    
    @PUT
    @Path("validaLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    public String validaUser(String content) {
        Gson g = new Gson();
        usuario u = g.fromJson(content, usuario.class);
        usuarioDAO ud = new usuarioDAO();
        u = ud.validaUsuario(u);
        return g.toJson(u);
    }
    
    @PUT
    @Path("buscarLivroBiblioteca")
    @Consumes(MediaType.APPLICATION_JSON)
    public String buscaLivroBiblioteca(String content) {
        Gson g = new Gson();
        livro l = g.fromJson(content, livro.class);
        livro_bibliotecaDAO lbd = new livro_bibliotecaDAO();
        livrosBiblioteca lb = lbd.buscaLivros(l.getNome());
        return g.toJson(lb);
    }
    
    @PUT
    @Path("buscarLivroLoja")
    @Consumes(MediaType.APPLICATION_JSON)
    public String buscaLivroLoja(String content) {
        Gson g = new Gson();
        livro l = g.fromJson(content, livro.class);
        livro_lojaDAO lld = new livro_lojaDAO();
        livrosLoja ll = lld.buscaLivros(l.getNome());
        return g.toJson(ll);
    }
    
    @GET
    @Path("buscarLojasBibliotecas")
    @Consumes(MediaType.APPLICATION_JSON)
    public String buscaLojasBibliotecas() {
        Gson g = new Gson();
        lojaDAO ld = new lojaDAO();
        bibliotecaDAO bd = new bibliotecaDAO();
        BibliotecasLojas bl = new BibliotecasLojas();
        bl.arrayLoja = ld.buscaLojas();
        bl.arrayBiblioteca = bd.buscaBiblotecas();
        return g.toJson(bl);
    }
    
    
}
