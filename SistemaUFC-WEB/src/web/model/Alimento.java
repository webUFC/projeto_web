package web.model;

public class Alimento {
	private String nome;
	private Categoria categoria;
	private InforNutricional infoNutricional;
	private int idAlimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public InforNutricional getInfoNutricional() {
		return infoNutricional;
	}
	public void setInfoNutricional(InforNutricional infoNutricional) {
		this.infoNutricional = infoNutricional;
	}
	
	public int getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}
	
	public Alimento(String nome, Categoria categoria, InforNutricional infoNutricional) {
		this.nome = nome;
		this.categoria = categoria;
		this.infoNutricional = infoNutricional;
	}
}
