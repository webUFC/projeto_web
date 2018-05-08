package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import web.dao.conexao.ConnectionFactory;

public class AlimentoDAO {
	
	public void inserirAlimento(){
		Connection con = new ConnectionFactory().getConnection();
		
		String sql = "INSERT INTO alimento (categoria,nomeAliment, valorNutri) VALUES (?, ?, ?)";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setInt(1, 0);
			prepare.setString(2, "FAZER");
			prepare.setInt(3, 0);
			
			if(!prepare.execute()) {
				System.out.println("nao deu certo");
			}
			else {
				System.out.println("deu certo");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void deletarAlimento(){
			Connection con = new ConnectionFactory().getConnection();
			
			String sql = "DELETE FROM alimento WHERE nomeAliment = ?";
			
			try {
				PreparedStatement prepare = con.prepareStatement(sql);
				prepare.setString(1, "NOME");
			
				if(!prepare.execute()) {
					System.out.println("nao deu certo");
				}
				else {
					System.out.println("deu certo");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	    }
		
		public void editarAlimento() {
			Connection con = new ConnectionFactory().getConnection();
			String sql = "UPDATE alimento SET nomeAliment = ?, categoria = ?, valorNutri=?";
			try {
				PreparedStatement prepare = con.prepareStatement(sql);
				prepare.setString(1, "NOME");
				prepare.setInt(2, 0);
				prepare.setInt(1, 0);
				
				if(!prepare.execute()) {
					System.out.println("nao deu certo");
				}
				else {
					System.out.println("deu certo");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void listarAlimentos() {
			Connection con = new ConnectionFactory().getConnection();
			String sql = "SELECT * FROM alimento";
			try {
				PreparedStatement prepare = con.prepareStatement(sql);
				prepare.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
