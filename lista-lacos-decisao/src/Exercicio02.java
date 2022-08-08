//2- Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1=entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2=entrada.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3=entrada.nextInt();
		
		if ((n2<n3)&&(n2>n1)) {
			
			System.out.println("Ordem crescente: n1+n2+n3 = "+n1+n2+n3);
			
		} else if((n3<n2)&&(n3>n1)) {
			
			System.out.println("Ordem crescente: n1+n3+n2 = "+n1+n3+n2);
			
		} else if((n1<n3)&&(n1>n2)) {
			
			System.out.println("Ordem crescente: n2+n1+n3 = "+n2+n1+n3);
			
		} else if((n3<n1)&&(n3>n2)) {
			
			System.out.println("Ordem crescente: n2+n3+n1 = "+n2+n3+n1);
			
		}else if((n2<n1)&&(n2>n3)) {
			
			System.out.println("Ordem crescente: n3+n2+n1 = "+n3+n2+n1);
			
		} else {
			
			System.out.println("Ordem crescente: n3+n1+n2 = "+n3+", "+n1+", "+n2);
			
		}
		
		entrada.close();
		
	}
	
}
