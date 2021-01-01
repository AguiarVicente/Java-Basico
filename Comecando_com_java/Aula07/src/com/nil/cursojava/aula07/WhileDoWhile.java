package com.nil.cursojava.aula07;

public class WhileDoWhile {

	public static void main(String[] args) {
	
		int i = 0;
		int max = 10;
		
		System.out.println("Contanto até " + max);
		
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i:" + i);
		}while(i < 15);

	}

}
