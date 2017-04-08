package modal;

public class Login implements Comparable<Login> {
	private String login;
	private String senha;
	private String usuario;
	private int id; 
	public Login() {
		id=0;
		login = "";
		senha = "";
		usuario = ""; 
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public int compareTo(Login cadastro) {
		return login.compareTo(cadastro.login);
	}
	
	@Override
	public boolean equals(Object obj) {
		Login loginRecebido = (Login) obj;
		return loginRecebido.getLogin().equals(this.login) && loginRecebido.getSenha().equals(this.senha); 
	}

}
