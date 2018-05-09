package web.model;

public enum Tipo {
	
	ALUNO("Aluno"),
	DOCENTE ("Docente"),
	FUNCIONARIO ("Funcionario"),
	LEITOR ("Leitor");
	private String tipoUsuario;
	
	private Tipo(String tipo) {
		this.tipoUsuario = tipo;
	}
	
	public String getTipo() {
		return tipoUsuario;
	}
}
