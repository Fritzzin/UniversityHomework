<%@page import="banco.BancoDados"%>
<%@page import="java.sql.*" %>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();

    Statement st = conexao.createStatement();

    String nome = request.getParameter("nome");
    String endereco = request.getParameter("endereco");
    String id = request.getParameter("id");

    st.execute("UPDATE clientes "
            + "SET nome = '" + nome + "', "
            + "endereco = '" + endereco + "' "
            + "WHERE id = '" + id + "' ");

    response.sendRedirect("cliente_tabela.jsp");
%>