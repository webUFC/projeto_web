package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.dao.conexao.ConnectionFactory;
import web.model.Carteira;

public class CarteiraDAO {
	private static CarteiraDAO instance;
	
	public static CarteiraDAO getInstance() {
		if(instance==null) instance = new CarteiraDAO();
		return instance;
	}
	
	public void criarCarteira(Carteira c) {
		Connection conn = ConnectionFactory.getInstancia().getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO carteira (saldo,quantidade) VALUES (?,?)");
			ps.setFloat(1, c.getValorSaldo());
			ps.setInt(2, c.getQuantidade());
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateCarteira(Carteira c) {
		Connection conn = ConnectionFactory.getInstancia().getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE carteira SET saldo = ?, quantidade = ? WHERE idCarteira = ?");
			ps.setFloat(1, c.getValorSaldo());
			ps.setInt(2, c.getQuantidade());
			ps.setInt(3, c.getIdCarteira());
			ps.execute();
			ConnectionFactory.closeConnection(conn, ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCarteira(int idCarteira) {
		Connection conn = ConnectionFactory.getInstancia().getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM carteira WHERE idCarteira = ?");
			ps.setFloat(1, idCarteira);
			ps.execute();
			ConnectionFactory.closeConnection(conn, ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Carteira buscarCarteira(int id) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM carteira WHERE idCarteira = '?'");
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
			ConnectionFactory.closeConnection(conn, ps,rs);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null; // Retorna null caso nenhuma carteira com o ID seja encontrada!
	}
}
