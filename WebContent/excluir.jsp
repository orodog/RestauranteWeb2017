<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Excluir Produto</title>
</head>
<body>
	<h2 id="h2">Excluir produto</h2>
	
	<div>
	<form action="Cardapio.do?acao=Excluir" method="post">
		
		<fieldset>
			<label for="id_mercadoria">indique o codigo do produto</label> 
			<input id="id_mercadoria" name="id_mercadoria">
		</fieldset>
		
		<input type="submit" name="Excluir" value="Excluir" />
	
		<h4>${Mensagem}</h4>
	</form>
	</div>
	<div>
		<a href="index.jsp"><button>Voltar</button></a>
	</div>		
	
</body>
</html>