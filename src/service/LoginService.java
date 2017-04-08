package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import modal.Login;
import criptografia.CriptografiaSenha;
import dao.LoginDAO;

public class LoginService {

	private Scanner scannerArquivo;
	private List<Login> listLogin = new ArrayList<>();
	private CriptografiaSenha criptografia; 
	private LoginDAO loginConect; 
	

	public LoginService() {
		loginConect = new LoginDAO();
	}
		
	public Boolean validaLogin(Login log) {

		int inicio = 0;
		int fim = listLogin.size() - 1;

		while (inicio <= fim) {
			
			 int meio = (inicio + fim) / 2;
			System.out.println(meio);
			
			if (log.equals(listLogin.get(meio))){
				return true;
			}
			
			if (log.compareTo(listLogin.get(meio)) < 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		
		return false;
	}

	public void ordenaLogin() {
		Login login = new Login();
		
		try {
				listLogin = loginConect.listarLogin();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		Collections.sort(listLogin);
		
		for (Login log : listLogin) {
			System.out.println(
			log.getLogin() + " " + log.getSenha());
		}
	}

}

/*public void realizarLogin(){


public void teste(){

	
	// BuscaBinaria bb = new BuscaBinaria();
				Boolean validaLogin = false;
				LoginService log = new LoginService();
				String aux = "";
				String tpLogin = "";
				Login login = new Login();
				try {

					login.setLogin(tLogin.getText());
					login.setSenha(String.valueOf(CriptografiaSenha.encriptarSenha());

					log.ordenaLogin();
					validaLogin = log.validaLogin(login);

					if (validaLogin == true) {

						MenuInicial menu = new MenuInicial(tLogin.getText(), ling);
						menu.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos");
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}

			
}*/
