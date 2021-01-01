package com.nil.cursojava.orientacao_objetos.palavra_this;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro() {}
	
	

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros!");
	}



	public Carro(String marca, String modelo) {
		this(marca, modelo, 15);
		System.out.println("Chamando o construtor com 2 parâmetros!");
	}



	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {
		
		System.out.println("Método obeterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		
		double qtdCombustivel =  km/this.consumoCombustivel;
		
		return qtdCombustivel;
		
	}
}