package br.com.aguiardafa.estudo.designpatterns2.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private String enderecoBd = "//localhost:3306";
	private String nomeBd = "banco";
	private String user = "usuário";
	private String senha = "senha";
	
	public Connection getConnection() {
		try {
			Connection conexao;
			String tipoBd = System.getenv("tipoBanco");
			
			if("mysql".equals(tipoBd)) {
				conexao = 
						DriverManager.getConnection("jdbc:mysql:"+this.enderecoBd+"/"+this.nomeBd, 
													this.user,
													 this.senha);
			}else {
				conexao = 
						DriverManager.getConnection("jdbc:postgres:"+this.enderecoBd+"/"+this.nomeBd, 
													this.user,
													 this.senha);
			}
			
			return conexao;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
