package com.nil.cursojava.orientacao_objetos.overload;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		for(int x = 0; x < vetor.length; x++) {
			vetor[x] = x;
		}
		
//		MinhaCalculadora calc = new MinhaCalculadora();
		
//		System.out.println(calc.soma(1, 2));
//		System.out.println(calc.soma(1.0, 2.0));
//		System.out.println(calc.soma(1, 2, 4));
//		System.out.println(calc.soma(vetor));
		
// quando o método é public static não precisa instanciar a classe como acima
		
		System.out.println(MinhaCalculadora.soma(1, 2));
		System.out.println(MinhaCalculadora.soma(1.0, 2.0));
		System.out.println(MinhaCalculadora.soma(1, 2, 4));
		System.out.println(MinhaCalculadora.soma(vetor));

	}

}
