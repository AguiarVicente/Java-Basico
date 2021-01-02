package com.nil.cursojava.interfaces;

public abstract class Animal {
	
	String nome;
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
