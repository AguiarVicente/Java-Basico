package com.nil.cursojava.orientacao_objetos.classes_abstratas;

public class Aluno extends Pessoa{
	
	
	private String curso;
	private double notas;
	
	public void verificarAcesso() {
		
		super.nomeVisibilidade = "Maria";
		this.nomeVisibilidade = "Pedro";
		
	}
	
	
	public Aluno() {
		super();
	}
	
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("10822772744");
		
		this.setCpf("10822772744");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		s += this.getEndereco();
		
		return s;
		
	}


//	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
}
