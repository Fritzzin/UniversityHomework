<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="banco.BancoDados"%>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();
    Statement st = conexao.createStatement();
    String id = request.getParameter("id");
    if (id != null) {
        st.execute("DELETE FROM clientes WHERE id= '" + id + "'");
    }
    response.sendRedirect("cliente_tabela.jsp");

%>