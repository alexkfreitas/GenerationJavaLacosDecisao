	/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		 */
		

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, diasTotal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		anos = entrada.nextInt();
		anos*=365;
		
		System.out.print("Digite sua idade em meses: ");
		meses = entrada.nextInt();
		meses*=30;
		
		System.out.print("Digite sua idade em dias: ");
		dias = entrada.nextInt();
		
		diasTotal = dias+meses+anos;
		
		System.out.println("Sua idade total em dias: "+diasTotal);
		
		
		entrada.close();
		
	}

}
