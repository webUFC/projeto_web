package web.model;

public class InforNutricional {
	private int idNutricional;
	private float calorias;
	private float carboidratos;
	private float proteinas;
	
	public InforNutricional(float calorias, float carboidratos, float proteinas) {
		this.calorias = calorias;
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
		this.idNutricional = -1;
	}
	
	public InforNutricional(int idNutricional, float calorias, float carboidratos, float proteinas) {
		super();
		this.idNutricional = idNutricional;
		this.calorias = calorias;
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
	}

	public int getIdNutricional() {
		return idNutricional;
	}
	public void setIdNutricional(int idNutricional) {
		this.idNutricional = idNutricional;
	}
	public float getCalorias() {
		return calorias;
	}
	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}
	public float getCarboidratos() {
		return carboidratos;
	}
	public void setCarboidratos(float carboidratos) {
		this.carboidratos = carboidratos;
	}
	public float getProteinas() {
		return proteinas;
	}
	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}
	
}
