package stackTrace_throws;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um numero decimal: ");
		try {
			double num = lerNumero();
			System.out.println("Você digitou o numero: " + num);
			System.out.println();
		}catch (Exception e) {

			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		
		return num;
	}
	
}
