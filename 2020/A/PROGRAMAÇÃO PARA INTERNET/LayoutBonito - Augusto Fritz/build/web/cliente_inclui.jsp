<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>Novo Cliente</title>

        <style>
            body{
                background: #333;
                background-position:center; 
                background-size:cover; 
                padding-left: 25%;
                padding-right: 25%;
                padding-top: 2%;
            }

            form{
                border: 3px solid #f5f5f5;
                background: #f0f0f0;
            }

            .container {
                padding: 16px;
            }

            .form-control {
                background: #f7f7f7 none repeat scroll 0 0;
                border: 1px solid #d4d4d4;
                border-radius: 4px;
                font-size: 14px;
                height: 50px;
                line-height: 50px;
            }
        </style>

        <script>
            function goBack(){
                window.history.back();
            }
        </script>
            
        
    </head>
    <body>

        <div class="container">

            <form action="cliente_inclui_processa.jsp" id="incluir">
                
                <label><b>Nome</b></label>
                <input class="form-control" type="text" name="nome" value="">
                
                <label><b>Endereço</b></label>
                <input  class="form-control" type="text" name="endereco" value="">

                <br>
                <input class="btn btn-danger" type="button" onclick="goBack()" value="Voltar">
                <input class="btn btn-primary" type="submit" value="Enviar">
            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
