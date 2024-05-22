<!DOCTYPE html>

<html lang="pt-BR">
  
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cadastro "Programa Dengue 0"</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel='stylesheet' type='text/css' media='screen' href='newcss1.css'>
        <style>
            .search {
            display: flex;
            align-items: center;
            background-color: gray;
            padding: 5px 10px;
            border-radius: 10px;
            }
  
            .searchInput {
            border: none;
            background-color: transparent;
            }
  
            .searchInput::placeholder {
            color: lightgray;
            }
            
            @import url("https://fonts.googleapis.com/css?family=Source+Sans+Pro");


            details {
            position: relative;
            }

            details summary::-webkit-details-marker {
            display: none;
            }

            details summary::before {
            content: "";
            position: absolute;
            left: 0;
            background: url("data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9IjM0IiB2aWV3Qm94PSIwIDAgMjQgMjQiIHdpZHRoPSIzNCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48cGF0aCBkPSJNOC41OSAxNi4zNGw0LjU4LTQuNTktNC41OC00LjU5TDEwIDUuNzVsNiA2LTYgNnoiLz48L3N2Zz4=")
            no-repeat 50% 50% / 1em 1em;
            width: 1.5em;
            height: 1.5em;
            transition: transform 0.1s linear;
            }

            summary {
            width: 100%;
            padding: 20px;
            padding-left: 25px;
            border-bottom: 1px solid #ccc;
            }

            summary:hover {
            color: #007bff;
            }

            summary:focus {
            outline: none;
            }

            details[open] summary:before {
            transform: rotate(90deg);
            }

            details[open] > summary {
            color: #007bff;
            }

            details[open] > summary ~ * {
            animation: open 1s ease;
            }

            p.source {
            padding-top: 50px;
            font-size: 0.75em;
            text-align: center;
            }

            @keyframes open {
            0% {
            opacity: 0;
            }

            100% {
            opacity: 1;
            }
            }
            
            #container{
        width: 100%;
        height: 330px;
    }
    #part1{
        width: 100%;
        height: 300px;
        background-color: #292929;
    }
    #part2{
        width: 100%;
        height: 50px;
        background-color: black;
        position: relative;
        top: -15px;
    }
    #companyinfo{
        width: 14%;
        height: 280px;
        position: relative;
        left: 8%;
        top: 30px;
    }
    #sitelink{
        font-size: 35px;
        color: #f44336;
    }
    #sitelink:hover{
        color: #e65100;
    }
    #title{
        color: gray;
        position: relative;
        top: 0px;
        font-size: 14.1px;
    }
    #detail{
        color: #aaa7a7;
        font-size: 16px;
    }
    #explore{
        width: 14%;
        height: 280px;
        position: relative;
        top: -235px;
        left: 29%;
    }
    #txt1, #txt2, #txt3, #txt4, #txt5{
        color: white;
        font-size: 20px;
    }
    .link{
        display: flex;
        width: 90px;
        height: 40px;
        color: #aaa7a7;
        background-color: transparent;
        border-top: 2px solid white;
        position: relative;
        top: -10px;
    }
    .link:hover, .link1:hover{
        color: #e65100;
    }
    #visit{
        width: 14%;
        height: 280px;
        position: relative;
        top: -515px;
        left: 42%;
    }
    .text{
        color: #aaa7a7;
        font-size: 14px;
        margin-top: -10px;
    }
    #legal{
        width: 14%;
        height: 280px;
        position: relative;
        top: -800px;
        left: 59.5%;
    }
    .link1{
        display: flex;
        width: 150px;
        height: 40px;
        color: #aaa7a7;
        background-color: transparent;
        border-top: 2px solid white;
        position: relative;
        top: -10px;
        margin-top: 7px;
    }
    #subscribe{
        position: relative;
        top: -1080px;
        left: 78%;
        width: 14%;
        height: 280px;
    }
    #email{
        color: white;
        position: relative;
        top: -20px;
    }
    .btn{
        position: relative;
        top: -10px;
    }
    #txt5{
        position: relative;
        top: 0px;
    }
    .social{
        position: relative;
        top: -5px;
        margin-right: 10px;
        color: white;
        cursor: pointer;
    }
    #txt6{
        color: white;
        position: relative;
        top: 13px;
        left: 8%;
        width: 80%;
        color: #aaa7a7;
    }
    .material-icons{
        position: relative;
        top: 3px;
    }
    @media only screen and (max-width:1000px){
        #companyinfo{
            width: 20%;
        }
        #sitelink{
            font-size: 30px;
        }
        #txt5, #txt4{
            font-size: 17px;
        }
        #txt5, .social{
            position: relative;
            top: -5px;
        }
    }
    @media only screen and (max-width:850px){
        #companyinfo{
            position: relative;
            left: 3%;
        }
        #txt6{
            position: relative;
            left: 3%;
        }
        #txt1, #txt2, #txt3, #txt4, #txt5{
            font-size: 15px;
        }
        #explore{
            position: relative;
            top: -240px;
            left: 26%;
        }
        #sitelink{
            font-size: 25px;
        }
        #detail{
            font-size: 13px;
        }
        .link{
            width: 60px;
        }
        #visit{
            position: relative;
            top: -520px;
            left: 37%;
        }
        .text{
            font-size: 13px;
        }
        #legal{
            position: relative;
            top: -800px;
            left: 54%;
        }
        #subscribe{
            position: relative;
            top: -1080px;
            left: 76%;
            width: 20%;
        }
        #txt5, .social{
            position: relative;
            left: -110%;
            top: px;
        }
        #email, .btn{
            position: relative;
            top: 0px;
        }
        #part1{
            height: 290px;
        }
    }
        </style>
    </head>
  
  <body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Cadastro "Programa Dengue 0"</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.php">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="?page=novo">Novo Cadastro</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="?page=listar">Listar Cadastros</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="?page=login">Fazer Login</a>
                        </li>
                    </ul>
                    <div class="navItem">
                        <div class="search">
                            <input type="text" placeholder="Buscar..." class="searchInput" >
                            <noscript><img loading="lazy" decoding="async" src=".https://cdn-icons-png.flaticon.com/512/25/25313.png" width="20" height="20" alt="" class="searchIcon"></noscript>
                            <img loading="lazy" loading="lazy" decoding="async" src='https://cdn-icons-png.flaticon.com/512/25/25313.png' data-src="https://cdn-icons-png.flaticon.com/512/25/25313.png" width="20" height="20" alt="" class="lazy searchIcon">
                        </div>
                    </div>
                </div>
        </div>
    </nav>
    
    <div class="container">
        <div class="row">
            <div class="col mt-5">
               
           
<?php 
    include ("config.php");
    switch (@$_REQUEST["page"]){
        case "novo";
            include("novo-usuario.php");
        break;
        case "listar":
            include("listar-usuario.php");
        break;
        case "salvar":
            include("salvar-usuario.php");
        break;
        case "login":
            include("faz-login.php");
        break;
        
    default :
        print "<h1>Bem vindo ao sistema de cadastro de focos de dengue!</h1>
        <br>";
        print "<h4>Esse sistema foi desenolvido para auxiliar o Ministério da
        Saúde a encontrar, catalogar e registrar os focos do mosquito Aedes
        que vem se espalhando cada vez mais pelo país de maneira 
        descontrolada.</h4>";
    }
?>
    
                
      
        </div>
    </div>
  </body>
</html>