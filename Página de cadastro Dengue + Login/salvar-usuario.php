<?php
    if(isset($_REQUEST["acao"])) {
        switch ($_REQUEST["acao"]) {
            case 'cadastrar':
                $nome = $_POST["nome"];
                $email = $_POST["email"];
                $data_nasc = $_POST["data_nasc"];
                $endereco = $_POST["endereco"];
                $det_foco = $_POST["det_foco"];
                
                $sql = "INSERT INTO usuarios (nome, email, data_nasc, endereco, 
                    det_foco) VALUES
                    ('{$nome}', '{$email}', '{$data_nasc}', '{$endereco}',
                    '{$det_foco}')"; // Adicionado parêntese de fechamento

                
                $res = $conn->query($sql);
                
                if($res == true){
                    echo "<script>alert('Cadastrado com sucesso!');</script>";
                    echo "<script>location.href='?page=listar';</script>";
                }else{
                    echo "<script>alert('Não foi possível cadastrar');</script>";
                    echo "<script>location.href='?page=listar';</script>";
                }
                break;
              
        }
    } else {
        echo "<script>alert('Ação não definida!');</script>";
        echo "<script>location.href='?page=listar;'</script>";
    }
