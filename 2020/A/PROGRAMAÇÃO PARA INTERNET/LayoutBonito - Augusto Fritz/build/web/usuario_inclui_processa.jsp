<%@page import="banco.BancoDados"%>
<%@page import="java.sql.*" %>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();

    Statement st = conexao.createStatement();

    String usuario = request.getParameter("usuario");
    String senha = request.getParameter("senha");

    st.execute("INSERT INTO usuarios(usuario,senha) "
            + "VALUES ('" + usuario + "', '" + senha + "')");

    response.sendRedirect("usuario_tabela.jsp");
%>