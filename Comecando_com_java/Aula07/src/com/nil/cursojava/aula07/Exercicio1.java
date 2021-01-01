package com.nil.cursojava.aula07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite dois valores:");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 > num2) {
				System.out.println("O " + num1 + " é maior.");
			}else {
				System.out.println("O " + num2 + " é maior.");
			}
		}
		
	}

}
