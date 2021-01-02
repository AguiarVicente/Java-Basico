package com.nil.cursojava.orientacao_objetos.classe_object;

import java.util.Arrays;

public class Aluno {
	
	
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {}
	
	
	public Aluno() {
	}
	
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		
		return s;
		
	}


//	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}


	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
//	public String toString() {
//		String s = curso + "\n";
//		for( double nota : notas) {
//			s += nota + " ";
//		}
//		return s;
//	}
	
	
	
}
