package web.model;

public enum TurnoSemana {
	MANHA("Manhã"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	private String periodo;
	
	private TurnoSemana(String turno) {
		this.periodo = turno;
	}

	public String getPeriodo() {
		return periodo;
	}
	
}
