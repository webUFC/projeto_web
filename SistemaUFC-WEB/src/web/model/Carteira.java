package web.model;

public class Carteira {
	
	private int idCarteira;
	private float valorSaldo;
	private int quantidade;
	
	public void setIdCarteira(int idCarteira) {
		this.idCarteira = idCarteira;
	}
	public int getIdCarteira() {
		return idCarteira;
	}
	public float getValorSaldo() {
		return valorSaldo;
	}
	public void setValorSaldo(float valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
