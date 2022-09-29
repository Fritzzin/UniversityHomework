<%@page import="banco.BancoDados"%>
<%@page import="java.sql.*" %>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();

    Statement st = conexao.createStatement();

    String nome = request.getParameter("nome");
    String endereco = request.getParameter("endereco");

    st.execute("INSERT INTO clientes(nome,endereco) "
            + "VALUES ('" + nome + "', '" + endereco + "')");

    response.sendRedirect("cliente_tabela.jsp");
%>