package web.model;

public class Usuario {
	private int idUser;
	private String nomeUser;
	private int matricula;
	private Tipo tipo;
	private Carteira idCarteira;
	private Validacao validacao;
	private boolean status;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Carteira getIdCarteira() {
		return idCarteira;
	}
	public void setIdCarteira(Carteira idCarteira) {
		this.idCarteira = idCarteira;
	}
	public Validacao getValidacao() {
		return validacao;
	}
	public void setValidacao(Validacao validacao) {
		this.validacao = validacao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
