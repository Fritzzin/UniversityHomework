<%@page import="banco.*" %>

<%
    String usuario = (String) request.getParameter("usuario");
    String senha = (String) request.getParameter("senha");

     if(new BancoDados().validaLogin(usuario, senha)) {
         session.setAttribute("Logado", "ok");
        response.sendRedirect("cliente_tabela.jsp");
    } else {
        response.sendRedirect("login.jsp");
        session.setAttribute("Logado", null);
    }
%>