package web.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import web.dao.CreditoDAO;

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
	
	public void alterarCredito(float valor) {
		
	}
	
	public float calcularCredito(int qnt, Tipo tipo) {
		/*
		 * fazer depois
		 * */
		
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
