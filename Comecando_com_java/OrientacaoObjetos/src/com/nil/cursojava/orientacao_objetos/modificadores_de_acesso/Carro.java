package com.nil.cursojava.orientacao_objetos.modificadores_de_acesso;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	

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
