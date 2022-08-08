//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero=entrada.nextInt();
		
		if (numero%2==0) {
			
			System.out.println("O número é par!");
			System.out.println("Raiz quadrada de "+numero+": " + Math.sqrt(numero));
			
		} else {
			
			System.out.println("O número é ímpar!");
			System.out.println(numero+"² = "+Math.pow(numero, 2));
			
		}
		
		entrada.close();
		
		
		
	}
	
}
