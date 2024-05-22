<h4>Novo Cadastro</h4>
<form action="?page=salvar" method="POST">
    
    <input type="hidden" name="acao" value="cadastrar">
    
    <div class="mb-3">
        <label>Nome</label>
        <input type="text" name="nome" class="form-control" required="">
    </div>
    
    <div class="mb-3">
        <label>E-mail</label>
        <input type="email" name="email" class="form-control" required="">
    </div>
    
    <div class="mb-3">
        <label>Endereço</label>
        <input type="text" name="endereco" class="form-control" required="">
    </div>
    
    <div class="mb-3">
        <label>Data de nascimento</label>
        <input type="date" name="data_nasc" class="form-control" required="">
    </div>
    
    <br/><h5>Agora cadastre os detalhes do foco</h5><br/>
    
     <div class="mb-3">
        <label>Detalhes sobre o foco:</label>
        <input type="text" name="det_foco" class="form-control" required="">
    </div>
    
    <div class="mb-3">
        <button type="submit" class="btn btn-primary">Enviar</button>
    </div>
</form>