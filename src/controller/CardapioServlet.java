package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CardapioService;
import modal.Cardapio;

@WebServlet("/Cardapio.do")
public class CardapioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao != null) {
			if (acao.equals("cadastrar")) {
				try {

					CardapioService cs = new CardapioService();
					
					Cardapio itemCardapio = new Cardapio();

					itemCardapio.setDescricao(request.getParameter("descricaoItem"));
					itemCardapio.setDisponibilidade(request.getParameter("disponibilidade"));
					itemCardapio.setValorUnitario(Double.parseDouble(request.getParameter("preco")));
					itemCardapio.setTipoProduto(request.getParameter("tipo"));
					
					cs.incluirProduto(itemCardapio);

					request.setAttribute("Mensagem", "Item inserido: "
							+ itemCardapio.getDescricao()
							+ " cadastrado com sucesso");

				} catch (Exception e) {

					request.setAttribute("Mensagem", "Erro: " + e.getMessage());

				} finally {

					request.getRequestDispatcher("cadastrar.jsp").forward(request, response);

				}

			} if(acao.equals("Excluir")){
				try {

					CardapioService cs = new CardapioService();
					
					Cardapio itemCardapio = new Cardapio();

					itemCardapio = cs.listarItemCardapio(Integer.parseInt(request.getParameter("id_mercadoria")));
					
					cs.ExcluirProduto(itemCardapio.getIdProduto());

					request.setAttribute("Mensagem", "Item excluido: "
							+ itemCardapio.getDescricao()
							+ " excluido com sucesso");

				} catch (Exception e) {

					request.setAttribute("Mensagem", "Erro: " + e.getMessage());

				} finally {

					request.getRequestDispatcher("excluir.jsp").forward(request, response);

				}
				
			} if(acao.equals("consultar")){
				try {

					CardapioService cs = new CardapioService();
					
					String listaCardapio = cs.listadeProdutos(); 
					
					
					request.setAttribute("Cardapio", "Cadadapio \n" + listaCardapio);
					

				} catch (Exception e) {

					request.setAttribute("Mensagem", "Erro: " + e.getMessage());

				} finally {

					request.getRequestDispatcher("consultarCardapio.jsp").forward(request, response);

				}
				
			} if(acao.equals("alterar")){
				try {

					CardapioService cs = new CardapioService();
					
					Cardapio itemCardapio = new Cardapio();
					
					itemCardapio.setIdProduto(Integer.parseInt(request.getParameter("id_Item")));
					itemCardapio.setDescricao(request.getParameter("descricaoItem"));
					itemCardapio.setDisponibilidade(request.getParameter("disponibilidade"));
					itemCardapio.setValorUnitario(Double.parseDouble(request.getParameter("preco")));
					itemCardapio.setTipoProduto(request.getParameter("tipo"));
					
					cs.alterarProduto(itemCardapio);
					
					itemCardapio = cs.listarItemCardapio(itemCardapio.getIdProduto());
					
					request.setAttribute("Mensagem", " Item alterado:" + itemCardapio.getDescricao()+ " com sucesso") ;
					

				} catch (Exception e) {

					request.setAttribute("Mensagem", "Erro: " + e.getMessage());

				} finally {

					request.getRequestDispatcher("alterar.jsp").forward(request, response);

				}
				
			} 

		}
	} 
	
}
