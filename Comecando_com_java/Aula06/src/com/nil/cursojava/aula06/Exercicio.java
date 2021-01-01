package com.nil.cursojava.aula06;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//exercicio 1
		System.out.println("Olá Mundo!");
		
		// exercicio 2
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		System.out.println("O número digitado foi: " + num);
		
		// exercicio 3
		System.out.println("Digite dois números a ser somado:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Soma de " + num1 + " + " + num2 + " = " + (num1 + num2));
		
		// exercicio 4
		System.out.println("Digite as notas dos bimestres: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		float nota4 = scan.nextFloat();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Sua média é: " + media);
		
		// exercicio 5
		System.out.println("Converta metros em centímetros: ");
		double metro = scan.nextDouble();
		double cent = metro * 100;
		System.out.println(metro + " possui " + cent + " centímetros");
		
		//exercicio 6
		System.out.println("Informe o raio do círculo: ");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do círculo é: " + area);
		
		// exercicio 7
		System.out.println("Digite os lados do quadrado: ");
		double base = scan.nextDouble();
		double altura = scan.nextDouble();
		double areaQuad = base * altura;
		double dobAreaQua = 2 * areaQuad;
		System.out.println("A area do quadrado = " + areaQuad + " e dobro da area = " + dobAreaQua);

	}

}
