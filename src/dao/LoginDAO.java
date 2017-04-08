package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modal.Cardapio;
import modal.Login;

public class LoginDAO {
	private PreparedStatement st;
	Connection conn;
	DatabaseConnect db;

	public LoginDAO() {
		db = new DatabaseConnect();
		try {
			conn = db.obtemConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Login> listarLogin() throws SQLException {

		db = new DatabaseConnect();
		String sql = "select * from login";
		st = conn.prepareStatement(sql);
		ResultSet resultSet = st.executeQuery();

		List<Login> loginList = new ArrayList<Login>();

		while (resultSet.next()) {
			Login login = new Login();
			
			login.setId(resultSet.getInt("id"));
			login.setLogin(resultSet.getString("login"));
			login.setSenha(resultSet.getString("senha"));
			login.setUsuario(resultSet.getString("usuario"));

			loginList.add(login);
		}

		return loginList;

	}
}
