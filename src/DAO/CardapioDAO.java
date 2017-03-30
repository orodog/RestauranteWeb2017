package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Modal.Cardapio;
import Modal.Cardapio;

public class CardapioDAO {
	private ArrayList<Cardapio> cardapioList;
	private PreparedStatement st;
	Connection conn;
	DatabaseConnect db;

	public CardapioDAO() {
		db = new DatabaseConnect();
		try {
			conn = db.obtemConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean alterarCardapio(Cardapio itemCardapio) {
		try {
			String updateItemCardapio = "UPDATE mercadoria set descricao = ?, tipo = ?, preco =? , disponibilidade = ? where id= ?";
			st = conn.prepareStatement(updateItemCardapio);

			st.setString(1, itemCardapio.getDescricao());
			st.setString(2, itemCardapio.getTipoProduto());
			st.setDouble(3, itemCardapio.getValorUnitario());
			st.setString(4, itemCardapio.getDisponibilidade());
			st.setInt(5, itemCardapio.getIdProduto());
			st.executeUpdate();
			st.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	 public List<Cardapio> listarCardapio() throws SQLException {
	  
	  db = new DatabaseConnect(); String sql = "select * from mercadoria"; st =
	  conn.prepareStatement(sql); ResultSet resultSet = st.executeQuery();
	  
	  List<Cardapio> cardapioList = new ArrayList<Cardapio>();
	  
	  while(resultSet.next()){
	  
	  Cardapio cardapioItem = new Cardapio();
	  
	  cardapioItem.setIdProduto(resultSet.getInt("id"));
	  cardapioItem.setDescricao(resultSet.getString("descricao"));
	  cardapioItem.
	  setValorUnitario(Double.parseDouble(resultSet.getString("Preco")));
	  cardapioItem.setTipoProduto(resultSet.getString("tipo"));
	  cardapioItem.setDisponibilidade(resultSet.getString("disponibilidade"));
	  cardapioList.add(cardapioItem); }
	  
	  return cardapioList;
	  
	  }
	 

	public Cardapio listarItemCardapio(int id) {

		Cardapio cardapio = new Cardapio();
		cardapio.setIdProduto(id);
		String sql = "SELECT id, descricao, tipo, preco, disponibilidade FROM mercadoria WHERE id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();

		PreparedStatement stm = conn.prepareStatement(sql);) {

			stm.setInt(1, cardapio.getIdProduto());

			try (ResultSet resultSet = stm.executeQuery();) {
				if (resultSet.next()) {
					cardapio.setIdProduto(resultSet.getInt("id"));
					cardapio.setDescricao(resultSet.getString("descricao"));
					cardapio.setTipoProduto(resultSet.getString("tipo"));
					cardapio.setValorUnitario(Double.parseDouble(resultSet
							.getString("Preco")));
					cardapio.setDisponibilidade(resultSet
							.getString("disponibilidade"));
				} else {
					cardapio.setIdProduto(-1);
					cardapio.setDescricao(null);
					cardapio.setValorUnitario(-1.0);
					cardapio.setTipoProduto(null);
					cardapio.setDisponibilidade(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return cardapio;
	}

	
	// Método para exibir produtos no Textarea
	public String Consultar() {
		String conteudo = " ";

		try {
			String sql = "select * from mercadoria";
			st = conn.prepareStatement(sql);
			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				conteudo += "Cód: " + resultSet.getInt("id") + "\t";
				conteudo += " " + resultSet.getString("descricao") + "\t";
				conteudo += " " + resultSet.getString("tipo") + "\t";
				conteudo += "R$: " + resultSet.getString("Preco") + "\t";
				conteudo += " " + resultSet.getString("disponibilidade") + "\n";

			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conteudo;
	}

	public boolean Incluir(Cardapio cardapio) {
		boolean sucesso = false;
		// int id = proximaId();
		String sql = "insert into mercadoria(descricao,tipo,preco,disponibilidade) VALUES(?,?,?,?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, cardapio.getDescricao());
			st.setString(2, cardapio.getTipoProduto());
			st.setDouble(3, cardapio.getValorUnitario());
			st.setString(4, cardapio.getDisponibilidade());
			st.execute();

			sucesso = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// db.closeConnection();
		return sucesso;

	}

	
	public int proximaId() {

		int conteudo = 1;

		try {

			String sql = "SELECT ID FROM MERCADORIA ORDER BY ID DESC LIMIT 1;";
			st = conn.prepareStatement(sql);
			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				conteudo += resultSet.getInt("id");
			}

			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// db.closeConnection ();
		return conteudo;
	}

	public boolean Excluir(int id) {
		boolean sucesso = false;

		try {
			String sql = "delete from mercadoria where id = ?";
			st = conn.prepareStatement(sql);
			st.setInt(1, id);// Necesário excluir id de itemcompra
			st.executeUpdate();
			sucesso = true;
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// db.closeConnection();
		return sucesso;
	}

}
