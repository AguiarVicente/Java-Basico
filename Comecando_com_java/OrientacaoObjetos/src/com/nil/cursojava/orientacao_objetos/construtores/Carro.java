package com.nil.cursojava.orientacao_objetos.construtores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe carro foi instanciada!");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		
		System.out.println("Método obeterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		double qtdCombustivel =  km/consumoCombustivel;
		return qtdCombustivel;
	}
}
