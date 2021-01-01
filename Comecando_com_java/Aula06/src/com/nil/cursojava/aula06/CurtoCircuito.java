package com.nil.cursojava.aula06;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado1 = verdadeiro & falso;
		boolean resultado2 = verdadeiro && falso;
		
		boolean resultado3 = falso & verdadeiro;
		boolean resultado4 =  falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);

	}

}
