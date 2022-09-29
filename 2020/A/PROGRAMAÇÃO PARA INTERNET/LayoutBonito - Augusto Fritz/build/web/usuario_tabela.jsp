<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="banco.*"%>
<%
    BancoDados bd = new BancoDados();
    Connection conexao = bd.getConnection();
%>


<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        
        <!-- Font Awesome js-->
        <script src="https://kit.fontawesome.com/221eb5c2ea.js" crossorigin="anonymous"></script>
        
        <title>Tabela de Usuários</title>
    </head>
    <body>

        <%@include file="navbar.jsp" %>
        
        
        <div>
            <table class="table table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col" style="width: 10%">
                            <a title="Adicionar" href="usuario_inclui.jsp">
                                <i class="fa fa-plus fa-2x" style="color: greenyellow"></i>
                            </a>
                        </th>
                        <th scope="col" style="width: 10%">Código</th>
                        <th scope="col" style="width: 30%">Usuário</th>
                        <th scope="col" style="width: 50%">Senha</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        Statement st = conexao.createStatement();
                        ResultSet rs = st.executeQuery("Select * from usuarios order by usuario");
                        while (rs.next()) {
                    %>
                    <tr>
                        <td><a title="Excluir" href="usuario_exclui.jsp?id=<%=rs.getString("id")%>"><i class="fa fa-times-circle fa-2x" style="color: red"></i></a>
                            <a title="Editar" href="usuario_altera.jsp?id=<%=rs.getString("id")%>&usuario=<%=rs.getString("usuario")%>&senha=<%=rs.getString("senha")%>"><i class="fa fa-pencil fa-2x" style="color: black"></i></a>
                        </td>
                        <td><%=rs.getString("id")%></td>
                        <td><%=rs.getString("usuario")%></td>
                        <td>***********</td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>