package web.model;

public class Categoria {
	private int idCategoria;
	private String nomeCategoria;
	
	public Categoria() {
		
	}
	
	public Categoria(String nomeCateg) {
		this.nomeCategoria = nomeCateg;
	}

	public void criarCategoria() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	//IMPLEMENTACAO DA CLASSE CATEGORIA
	
	
}
