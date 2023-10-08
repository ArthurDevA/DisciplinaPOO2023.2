package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro e positivo N: ");
        int n = scanner.nextInt();
        scanner.close();

        double e = 1;

        for (int i = 1; i <= n; i++) {
            double fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1 / fat;
        }

        System.out.println("O valor de E é: " + e);
	}

}
