//6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
//P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
//	
//	d = raiz de (x2-x1)² + (y2-y1)²

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int x1,y1,x2,y2;
		double d;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de x1: ");
		x1 = entrada.nextInt();
		
		System.out.print("Digite o valor de y1: ");
		y1 = entrada.nextInt();
		
		System.out.print("Digite o valor de x2: ");
		x2 = entrada.nextInt();
		
		System.out.print("Digite o valor de y2: ");
		y2 = entrada.nextInt();
		
		d = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		
		System.out.println("A distância entre eles é de: "+d);
		
		entrada.close();
		
	}
	
}
