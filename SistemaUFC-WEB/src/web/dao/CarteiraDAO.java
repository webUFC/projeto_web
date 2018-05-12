package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import web.dao.conexao.ConnectionFactory;
import web.model.Carteira;

public class CarteiraDAO {
	
	private static CarteiraDAO instance;
	
	public static CarteiraDAO getInstance() {
		if(instance == null) instance = new CarteiraDAO();
		return instance;
	}
	
	public Carteira buscarCarteira(int id) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from carteira where idCarteira = '?'");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int idCarteira = rs.getInt(1);
				float valorSaldo = rs.getFloat(2);
				int quantidade = rs.getInt(3);
				Carteira c = new Carteira();
				c.setQuantidade(quantidade);
				c.setValorSaldo(valorSaldo);
				c.setIdCarteira(idCarteira);
				return c;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null; // Retorna null caso nenhuma carteica com o ID seja encontrada!
	}
}
