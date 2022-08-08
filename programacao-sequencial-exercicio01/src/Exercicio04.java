//4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
//	D = (R+S)/2, onde:
//	R = (A+B)²
//	S = (B+C)²

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int a, b, c, d, r, s;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = entrada.nextInt();
		
		r = (int) Math.pow(a+b, 2);
		s = (int) Math.pow(b+c, 2);
		d = (int) Math.pow(r+s, 2);
		
		System.out.println("Valor de R: "+r);
		System.out.println("Valor de S: "+s);
		System.out.println("Valor de D: "+d);
		
		entrada.close();
		
		
		
		
	}

}
