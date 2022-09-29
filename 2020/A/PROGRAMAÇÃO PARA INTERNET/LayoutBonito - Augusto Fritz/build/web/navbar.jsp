<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="fab fa-ubuntu fa-2x navbar-brand" href="#"> XYZ</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="login.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Cadastros
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="cliente_tabela.jsp">Clientes</a>
                    <a class="dropdown-item" href="usuario_tabela.jsp">Usuários</a>
                    <a class="dropdown-item disabled" href="#">Fornecedores</a>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" action="login.jsp">
            <button class="btn btn-danger my-2 my-sm-0" type="submit">Sair</button>
        </form>
    </div>
</nav> 