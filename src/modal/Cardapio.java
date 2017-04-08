package modal;

public class Cardapio  {

	private int idProduto;
	private String tipoProduto;
	private String descricao;
	private double valorUnitario;
	private String disponibilidade; 
	
	public Cardapio() {
		this.idProduto = -1;
		this.tipoProduto = null;
		this.descricao = null;
		this.valorUnitario = -1.0;
		this.disponibilidade= null; 	
	}
	
	public Cardapio(int idPdoduto, String tipoProduto, String descricao, double valorUnitario, String disp) {
		this.idProduto = idPdoduto;
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.disponibilidade= disp; 
	}
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDisponibilidade(String descricao) {
		this.disponibilidade = descricao;
	}

	public String getDisponibilidade() {
		return this.disponibilidade;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
