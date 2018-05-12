package web.model;

import web.dao.AlimentoDAO;

public class Alimento {
	private String nome;

	private Categoria categoria = new Categoria();
	private InforNutricional infoNutricional = new InforNutricional();
	private AlimentoDAO alimentoDAO = AlimentoDAO.getInstancia();
	
	/* ******** SET's AND GET'S ***********************************************/

	//private Categoria categoria;
	//private InforNutricional infoNutricional;
	
	
	
//>>>>>>> 70bbf3ca8664e1a28985ce65485ebdec96ad66ec
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
	
//<<<<<<< HEAD
	/* ******** INSERT *******************************************************/
	/*
	public void inserirAlimento(Alimento alimento){
		Alimento novoAlimento = new Alimento();
		try {
		//	novoAlimento.categoria.setIdCategoria(alimento.categoria.getIdCategoria());
			novoAlimento.setNome(nome);
			//novoAlimento.infoNutricional.setInfoNutricional(novoAlimento.infoNutricional.getIdInfoNutricional());
			alimentoDAO.inserirAlimento(novoAlimento);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	*/
	/* ******** DELETE *******************************************************/
	public void deletarAlimento(String nome){
		try {
			alimentoDAO.deletarAlimento(nome);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
	
	

	//public Alimento() {
//=======

	public Alimento(String nome, Categoria categoria, InforNutricional infoNutricional) {
		//super();
		//this.nome = nome;
	//	this.categoria = categoria;
	//	this.infoNutricional = infoNutricional;
//>>>>>>> 70bbf3ca8664e1a28985ce65485ebdec96ad66ec
	}
}
