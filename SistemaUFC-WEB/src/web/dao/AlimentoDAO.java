package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web.dao.conexao.ConnectionFactory;
import web.model.Alimento;
import web.model.Categoria;
import web.model.InforNutricional;

public class AlimentoDAO {
	
	public void inserirAlimento(Alimento a){
		Connection con = new ConnectionFactory().getConnection();
		String sql = "INSERT INTO alimento (categoria,nomeAliment, valorNutri) VALUES (?, ?, ?)";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setInt(1, a.getCategoria().getIdCategoria());
			prepare.setString(2, a.getNome());
			prepare.setInt(3, a.getInfoNutricional().getIdNutricional());
			prepare.execute();
			ConnectionFactory.closeConnection(con, prepare);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public void deletarAlimento(int idAlimento){
		Connection con = new ConnectionFactory().getConnection();
		String sql = "DELETE FROM alimento WHERE idAlimento = ?";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setInt(1, idAlimento);
			prepare.execute();
			ConnectionFactory.closeConnection(con, prepare);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
	public void atualizarAlimento(Alimento a) {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "UPDATE alimento SET nomeAliment = ?, categoria = ?, valorNutri=? WHERE idAlimento = ?";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, a.getNome());
			prepare.setInt(1, a.getCategoria().getIdCategoria());
			prepare.setInt(2, a.getInfoNutricional().getIdNutricional());
			prepare.setInt(3, a.getIdAlimento());
			prepare.execute();
			ConnectionFactory.closeConnection(con, prepare);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Alimento> listarAlimentos() {
		List<Alimento> la = new ArrayList<Alimento>();
		Connection con = new ConnectionFactory().getConnection();
		String sql = "SELECT * FROM alimento";
		try {
			PreparedStatement prepare = con.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while(result.next()) {
				//TODO: Buscar no DAO
				Categoria categoria = null;
				InforNutricional info = null;
				Alimento a = new Alimento(result.getString("nomeAlimento"), categoria, info);
				la.add(a);
			}
			ConnectionFactory.closeConnection(con, prepare, result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return la;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
