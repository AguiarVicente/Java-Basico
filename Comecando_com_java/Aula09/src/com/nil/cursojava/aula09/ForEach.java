package com.nil.cursojava.aula09;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random rand = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = rand.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println("Usando o ForEach");

		for (int nota : notas) {
			System.out.println(nota);
		}

	}

}
