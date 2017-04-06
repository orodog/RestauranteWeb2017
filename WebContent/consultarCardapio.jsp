<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean class="managdBeans.ManagdBeansCardapio" id="mb"></jsp:useBean>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	
	<script src="js/bootstrap.min.js"></script>     
	
	<title id="id_consultarCardapio">Consultar Cardapio</title>  

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
 <h3 class="page-header">Cardápio</h3>
</div>

    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Tipo</th>
                <th>Descrição</th>
                <th>Preço</th>
                <th>Disponibilidade</th>
            </tr>
        </thead>
        <tbody>

				<c:forEach items="${mb.listagemCardapio}" var="c">
					<tr>
						<td>${c.idProduto}</td>
						<td>${c.tipoProduto}</td>
						<td>${c.descricao}</td>
						<td>
							<fmt:formatNumber value="${c.valorUnitario}" type="currency"> </fmt:formatNumber>
						</td>	
						<td>${c.disponibilidade}</td>		
						
					</tr>
				
				</c:forEach>
				
        </tbody>
    </table>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
