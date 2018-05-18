package web.model;

import java.sql.Date;

public class Historico {
	private int idHistorico;
	private Carteira carteira;
	private TurnoSemana turno;
	private Date data;
	
	public Historico(Carteira carteira, TurnoSemana turno, Date data) {
		super();
		idHistorico = 0;
		this.carteira = carteira;
		this.turno = turno;
		this.data = data;
	}
	public int getIdHistorico() {
		return idHistorico;
	}
	public Carteira getCarteira() {
		return carteira;
	}
	public TurnoSemana getTurno() {
		return turno;
	}
	public Date getData() {
		return data;
	}
}
