package com.nil.cursojava.orientacao_objetos.palavra_final;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
//		Pessoa aluno = new Aluno();
//		Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		// exemplo de contatnte
		System.out.println(Contantes.URL_BLOG);
		Contantes.URL_BLOG = "Novo valor";
		System.out.println(Contantes.URL_BLOG);
		
		final int TOTAL = 1;
//		total += 1;
		System.out.println(TOTAL);
		
	}

}
