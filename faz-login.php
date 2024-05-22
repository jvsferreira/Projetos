<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <title>Sistema de Login</title> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <style>
            body{
                background-color: #F2F2F2;
            }
            .login{
                width: 100%;
                height: 100vh;
                align-items: center;
                justify-content: center;
                display: flex;
            }
        </style>        
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 offset-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <h3>Acesso Restrito</h3>
                        </div>
                        <div class="card-body">
                            <form action="login.php" method="POST">
                            <div>
                                <div class="mb-3">
                                    <label>Usuário</label>
                                    <input type="text" name="usuario" 
                                       class="form-control">
                                </div>
                                <div class="mb-3">
                                    <label>Senha</label>
                                    <input type="password" name="senha" 
                                       class="form-control">
                                </div>
                                <div>
                                    <div class="mb-3">
                                        <button type="submit" 
                                        class="btn btn-primary">Enviar</button>
                                    </div>
                                </div>        
                            </div>    
                        </form>
                        </div>
                    </div>
                </div>
            </div>
        
    </body>
</html>
