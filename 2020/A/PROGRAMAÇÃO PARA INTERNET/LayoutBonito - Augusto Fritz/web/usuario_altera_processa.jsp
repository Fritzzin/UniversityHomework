<%@page import="banco.BancoDados"%>
<%@page import="java.sql.*" %>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();

    Statement st = conexao.createStatement();

    String usuario = request.getParameter("usuario");
    String senha = request.getParameter("senha");
    String id = request.getParameter("id");

    st.execute("UPDATE usuarios "
            + "SET usuario = '" + usuario + "', "
            + "senha = '" + senha + "' "
            + "WHERE id = '" + id + "' ");

    response.sendRedirect("usuario_tabela.jsp");
%>