package Service;

import DAO.CardapioDAO;
import Modal.Cardapio;

public class CardapioService {

	CardapioDAO dao;
	
	
	public CardapioService(){
		dao = new CardapioDAO();
		
	}

	public Cardapio listarItemCardapio(int id){
		return dao.listarItemCardapio(id);
		
	} 

	public String listadeProdutos() {
		return dao.Consultar();
	}
	
	public boolean incluirProduto(Cardapio cardapio) {
		boolean sucesso = false;
		sucesso = dao.Incluir(cardapio);
		return sucesso;

	}
	
	public boolean ExcluirProduto(int idMercadoria) {
		return dao.Excluir(idMercadoria);
	}
	
	public boolean alterarProduto(Cardapio cardapio){
		return dao.alterarCardapio(cardapio); 
		
	}

}
