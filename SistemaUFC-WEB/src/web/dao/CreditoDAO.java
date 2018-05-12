package web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import java.sql.Connection;
import web.dao.conexao.ConnectionFactory;
import web.model.Credito;
import web.model.Tipo;

public class CreditoDAO {
	private ConnectionFactory dao = ConnectionFactory.getInstancia();
	
private static CreditoDAO instancia; 
	
	protected CreditoDAO() {
		
	}
	
	public static CreditoDAO getInstancia() {
		if (instancia == null) {
			instancia = new CreditoDAO();
		}
		return instancia;
	}
	
	public void categoriaCredito(Credito credito) {
		Connection con = dao.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement("INSERIR AQUI");
			stmt.setString(1, credito.getTipoUser().getTipo());
			stmt.setFloat(2, credito.getValorUnitario());
			stmt.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(CreditoDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	
	}
	
	public float valorCredito(Tipo tipo) {
		float valor = 0;
		Connection con = dao.getConnection();
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			stmt = con.prepareStatement("INSERIR CONSULTA");
			result = stmt.executeQuery();
			while(result.next()) {
				valor = result.getFloat(1);	
			}
			
		} catch (Exception e) {
			Logger.getLogger(CreditoDAO.class.getName()).log(Level.SEVERE, null, e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt, result);
		}
		
		return valor;
	}

	
}
