package com.nil.cursojava.orientacao_objetos.modificadores_de_acesso_protected;

public class Professor extends Pessoa{
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}



	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		return 0.0;
	}
}
