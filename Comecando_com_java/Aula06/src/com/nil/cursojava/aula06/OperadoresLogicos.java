package com.nil.cursojava.aula06;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é - resultado: " + resultado);
		
		resultado = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é - resultado: " + resultado);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		
	}

}
