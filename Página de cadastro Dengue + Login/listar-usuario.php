<h4>Listar Cadastros</h4>

<?php
    $sql = "SELECT * FROM usuarios";
    
    $res = $conn->query($sql);
    
   $qtd = $res->num_rows;
   
   if($qtd > 0){
       print "<table class='table table-hover table-striped table-bordered'>";
       print"<tr>";
           print "<th>#</th>";
           print "<th>Nome</th>";
           print "<th>E-mail</th>";
           print "<th>Data de Nascimento</th>";
           print "<th>Endereço</th>";
           print "<th>Detalhes sobre o foco</th>";
           print"</tr>";
       while($row = $res->fetch_object()){
           print"<tr>";
           print "<td>".$row->id."</td>";
           print "<td>".$row->nome."</td>";
           print "<td>".$row->email."</td>";
           print "<td>".$row->data_nasc."</td>";
           print "<td>".$row->endereco."</td>";
           print "<td>".$row->det_foco."</td>";
           
           print"</tr>";
       }
       print "</table>";
   }else{
       print"<p class='alert alert-danger'>Não encontrou resultados!</p>";
   }