<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title id="cadastrar">Cadastrar</title>  
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<script src="js/bootstrap.min.js"></script>

</head>

<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Menu Principal</a>
            
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                <li><a href="consultarCardapio.jsp">Consultar</a>
                <li><a href="cadastrar.jsp">Cadastrar</a> 
                <li><a href="alterar.jsp">Alterar</a>   
                <li><a href="excluir.jsp">Excluir</a>   
                </li>
               </ul>
            </div>
        </div>
    </nav>
   <!-- Container Principal -->
<div id="main" class="container-fluid">
 <h3 class="page-header">Cadastrar Produto</h3>
</div>
	<div>
	<form action="Cardapio.do?acao=cadastrar" method="post">
		<fieldset>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon2">Descrição:</span>
  			<input type="text" class="form-control" id="descricao_Item" name="descricaoItem" placeholder="Descrição do Produto" aria-describedby="basic-addon2">
		</div>
		</fieldset>
		<fieldset>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon2">Tipo:</span>
  			<input type="text" class="form-control" id="tipo" name="tipo" placeholder="Tipo do Produto" aria-describedby="basic-addon2">
		</div>
		</fieldset>
		<fieldset>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon2">Preço:</span>
  			<input type="text" class="form-control" id="preco" name="preco" placeholder="Preço do Produto" aria-describedby="basic-addon2">
		</div>		
		</fieldset>
		<fieldset>
		<div class="input-group">
		  <span class="input-group-addon" id="basic-addon2">Disponibilidade:</span>
  			<input type="text" class="form-control" id="disponibilidade" name="disponibilidade" placeholder="Disponibilidade do Produto" aria-describedby="basic-addon2">
		</div>
		</fieldset>	


		
		<div class="btn-group" role="group" aria-label="...">
  			<button type="submit" name="cadastrar" value="Cadastrar" class="btn btn-primary">Cadastrar</button>
		</div>
		
			<h4>${Mensagem}</h4>
	</form>	
			<div class="btn-group" role="group" aria-label="...">
  			<a href="index.jsp"><button type="button" class="btn btn-info">Voltar</button></a>
		</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
