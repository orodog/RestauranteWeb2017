
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title id="titulo">Alterar</title>

</head>
<body>

	<h2 id="h2">Alterar item</h2>
	
	<div>
	<form action="Cardapio.do?acao=alterar" method="post">
		<fieldset>
			<label for="id_Item">Id:</label> 
			<input id="id_Item" name="id_Item">
		</fieldset>
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
		
		<input type="submit" name="alterar" value="Alterar" />
		
		<h4>${Mensagem}</h4>
	</form>
	
	</div>
	<div>
		<a href="index.jsp"><button >Voltar</button></a>
	</div>
			
</body>
</html>
