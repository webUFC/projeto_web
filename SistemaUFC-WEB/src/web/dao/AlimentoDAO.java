package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import web.dao.conexao.ConnectionFactory;
import web.model.Alimento;

public class AlimentoDAO {
	
	private static AlimentoDAO instancia;
	
	/* ******** INSTANTIAT *******************************************************/
	public static AlimentoDAO getInstancia() {
		
		if(instancia == null) {
			instancia = new AlimentoDAO();
		}
		return instancia;
	}
	
	/* ******** INSERT FOOD *******************************************************/
	public void inserirAlimento(Alimento novoAlimento){
		Connection con = new ConnectionFactory().getConnection();
		
		String sql = "INSERT INTO alimento (categoria,nomeAliment, valorNutri) VALUES (?, ?, ?)";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
		//	prepare.setInt(1, (int) novoAlimento.getCategoria().getIdCategoria());
			prepare.setString(2, novoAlimento.getNome());
		//	prepare.setInt(3, novoAlimento.getInfoNutricional().getIdInfoNutricional());
			
			prepare.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* ******** DELETE FOOD *******************************************************/
	public void deletarAlimento(String nome){
		Connection con = new ConnectionFactory().getConnection();
			
		String sql = "DELETE FROM alimento WHERE nomeAliment = ?";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, nome);
			prepare.execute();			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/* ******** EDIT FOOD *******************************************************/
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
