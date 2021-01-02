package com.nil.cursojava.interfaces_heranca_casting_instanceof;

public class Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Pessoa pessoaAluno = aluno; // upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); // upcasting
		
		// Downcasting
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;
		
	}
	
	
}
