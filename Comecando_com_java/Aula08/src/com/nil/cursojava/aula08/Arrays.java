package com.nil.cursojava.aula08;

public class Arrays {

	public static void main(String[] args) {

		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		
		System.out.println("Tempratura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da tempratura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}
		
		
		// for melhorado
		for(double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
