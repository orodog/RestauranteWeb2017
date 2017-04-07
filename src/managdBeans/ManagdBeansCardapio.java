package managdBeans;

import java.util.List;

import Modal.Cardapio;
import DAO.CardapioDAO;

public class ManagdBeansCardapio {

	private List<Cardapio> listagemCardapio;

	public List<Cardapio> getListagemCardapio() {
		CardapioDAO cardapioDAO = new CardapioDAO();
		try {
			listagemCardapio = cardapioDAO.listarCardapio();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listagemCardapio;
	}

}
