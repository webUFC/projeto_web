package web.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import web.dao.CreditoDAO;
import web.dao.UsuarioDAO;

public class Credito {
	
	private Tipo tipoUser;
	private float valorUnitario;
	
	private CreditoDAO credito = CreditoDAO.getInstancia();

	public Credito(Tipo usuario, float valor) {
		this.setTipoUser(usuario);
		this.setValorUnitario(valor);
		
	}
	
	public void criarCredito() {
		try {
			credito.categoriaCredito(this);
		} catch (Exception e) {
			 Logger.getLogger(Credito.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	public void alterarCredito(Tipo tipo, float valor) {
		Credito cred = new Credito(tipo, valor);
		try {
			credito.modificarCredito(cred);
		} catch (Exception e) {
			 Logger.getLogger(Credito.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	public float calcularCredito(int qnt, Tipo tipo) {
		valorUnitario = credito.valorCredito(tipo);
		
		return valorUnitario;
	}
	
	
	
	//METODOS GETTERS E SETTERS
	public Tipo getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(Tipo tipoUser) {
		this.tipoUser = tipoUser;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	
	
	
}
