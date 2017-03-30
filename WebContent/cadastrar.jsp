
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title id="titulo">Cadastrar</title>

</head>
<body>

	<h2 id="h2">Novo item do Cardapio</h2>
	<div>
	<form action="Cardapio.do?acao=cadastrar" method="post">
		<fieldset>
			<label for="descricao_Item">Descrição:</label> 
			<input id="descricao_Item" name="descricaoItem">
		</fieldset>
		<fieldset>
			<label for="tipo">Tipo:</label> 
			<input id="tipo" name="tipo">
		</fieldset>
		<fieldset>
			<label for="preco">Preço:</label> 
			<input id="preco" name="preco">
		</fieldset>
		<fieldset>
			<label for="disponibilidade">Disponibilidade:</label> 
			<input id="disponibilidade" name="disponibilidade">
		</fieldset>
		
		<input type="submit" name="cadastrar" value="cadastrar" />
		
		<h4>${Mensagem}</h4>
	
	</form>
	</div>
	<div>
		<a href="index.jsp"><button id="voltar-inicial" class="botao bto-principal">Voltar</button></a>	
	</div>

</body>
</html>
