//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3,maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro número inteiro: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o valor do segundo número inteiro: ");
		n2 = entrada.nextInt();
		
		System.out.print("Digite o valor do terceiro número inteiro: ");
		n3 = entrada.nextInt();
		
		if(n1>maior) {
			maior=n1;
		} if(n2>n1) {
			maior=n2;
		} if(n3>n2) {
			maior=n3;
		}
		
		System.out.println("O maior número é o: "+maior);
		
		entrada.close();
		
	}

}
