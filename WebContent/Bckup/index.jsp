<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title id="titulo">Menu</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<h2 id="h2">Menu</h2>
	<div>
			<label for="preco">Alterar:</label> 
			<a href="alterar.jsp"> <button>Alterar</button> </a>	
	</div>
	<div>
			<label for="Excluir">Excluir:</label> 
			<a href="excluir.jsp"><button>Excluir</button> 	</a>

	</div>
	<div>
			<label for="Cadastrar">Cadastrar:</label> 
			<a href="cadastrar.jsp" ><button>Cadastrar</button></a>	
	</div>
	<div>
		<form action="Cardapio.do?acao=consultar" method="post">
			<label class="row" for="Consultar">Consultar:</label> 
			<a href="consultarCardapio.jsp"><input  class="btn btn-default" type="submit" name="Consultar" value="Consultar"  /></a>	
		</form>
	</div>	
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
