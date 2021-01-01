package com.nil.cursojava.orientacao_objetos.exercicios;

public class exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		if(lampada.ligada) {
			System.out.println("Lâmpada está ligada");
		}else {
			System.out.println("Lâmpada está desligada");
		}
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mudarEstado();
		
		if(lampada.ligada) {
			System.out.println("Lâmpada está ligada");
		}else {
			System.out.println("Lâmpada está desligada");
		}
		
		lampada.mostrarEstado();
		lampada.mudarEstado();
	}

}
