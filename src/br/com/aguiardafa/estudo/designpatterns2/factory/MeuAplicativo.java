package br.com.aguiardafa.estudo.designpatterns2.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MeuAplicativo {

	public static void main(String[] args) throws SQLException {
		//criando conexao com BD
		//Connection conexao = 
		//		DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");

		//traduzindo:
		//observe as inumeras informaçoes que utilizamos para tal
		//e caso precisarmos conectar no bd em mais de uma classe?
		//e caso precise mudar alguma configuracao?
		String tipoBd = "mysql";
		String enderecoBd = "//localhost:3306";
		String nomeBd = "banco";
		String user = "usuário";
		String senha = "senha";
		
		Connection conexao = 
				DriverManager.getConnection("jdbc:"+tipoBd+":"+enderecoBd+"/"+nomeBd, 
											user, senha);
		
		//para resolver esse problema
		//isolamos esse processo de criacao de bd em uma classe espefícia
		//a FACTORY de Conexoes
		Connection conexaoDaFactory = new ConnectionFactory().getConnection();
		
		PreparedStatement ps = conexaoDaFactory.prepareStatement("select * from tabela");

		// ... codigo continua
	}

}