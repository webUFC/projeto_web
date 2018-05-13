package web.testes;

import web.model.Credito;
import web.model.Tipo;

public class TesteCredito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float temp = 3.10F;
		
		/* TESTE PARA CRIA UM VALOR DE CREDITO
		Credito novoCredito = new Credito(Tipo.FUNCIONARIO, temp);
		novoCredito.criarCredito();
		*/
		
		//TESTE PARA ALTERAR O VALOR DE UM CREDITO
		//Credito alterar = new Credito();
		//alterar.alterarCredito(Tipo.ALUNO, temp);

		//TESTE PARA SABER O VALOR DE UM CREDITO
		Credito valor = new Credito();
		//temp = valor.valorCredito(Tipo.DOCENTE);
		//System.out.println(temp);
		
		//TESTE PARA CALCULAR O VALOR DA COMPRA DO CREDITO
		System.out.println(valor.calcularCredito(5, Tipo.ALUNO));
	}

}
