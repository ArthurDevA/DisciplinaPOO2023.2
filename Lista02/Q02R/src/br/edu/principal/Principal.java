package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media, af;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if ((media >= 0) & (media < 3)) {
			System.out.println("Reprovado");
		}
		
		else if ((media >= 3) & (media < 7)) {
			System.out.println("Exame");
			
			af = 12 - media;
			System.out.println("Deverá tirar nota igual ou superior a " + af + " para ser aprovado.");
		}
		
		else if ((media >= 7) & (media <= 10)) {
			System.out.println("Aprovado");
		}

	}
	
}