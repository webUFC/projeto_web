package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import web.dao.conexao.ConnectionFactory;
import web.model.Categoria;

public class CategoriaDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
	private static CategoriaDAO instancia;
	private Connection con;
	PreparedStatement stmt = null;
	
	protected CategoriaDAO() {
		
	}
	
	public static CategoriaDAO getInstancia() {
		if(instancia == null) {
			instancia = new CategoriaDAO();
		}
		return instancia;
	}
	
	public void criarCategoria(Categoria categoria) {
		con = dao.getConnection();
		stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO CATEGORIA(nomeCategoria) VALUE(?)");
			stmt.setString(1, categoria.getNomeCategoria());
		} catch (Exception e) {
			Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public List<Categoria> listarCategoria() {
		List<Categoria> categoria = new ArrayList<Categoria>();
		ResultSet resultado = null;
		try {
			stmt = con.prepareStatement("INSERIR AQUI");
			resultado = stmt.executeQuery();
			Categoria categ = new Categoria();
			while(resultado.next()) {
				categ.setIdCategoria(resultado.getInt(1));
				categ.setNomeCategoria(resultado.getString(2));
				categoria.add(categ);
			}
		} catch (Exception e) {
			Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt, resultado);
		}
		
		return categoria;
	}
	
	public void excluirCategoria(Categoria categoria) {
		con = dao.getConnection();
		try {
			stmt = con.prepareStatement("INSERIR AQUI");
			stmt.executeQuery();
		} catch (Exception e) {
			Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
	
	
}
