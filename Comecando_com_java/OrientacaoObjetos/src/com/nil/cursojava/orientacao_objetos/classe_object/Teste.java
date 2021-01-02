package com.nil.cursojava.orientacao_objetos.classe_object;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno.toString());
		
		String s1 = "auau";
		String s2 = "auau";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.equals(s2));

	}

}
