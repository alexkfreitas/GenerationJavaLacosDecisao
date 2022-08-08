//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int tempoTotalSegundos, horas, minutos, segundos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tempo de duração total do evento em segundos: ");
		tempoTotalSegundos = entrada.nextInt();
		
		horas = tempoTotalSegundos/3600;
		minutos = (tempoTotalSegundos%3600)/60;
		segundos = (tempoTotalSegundos%3600)%60;
		
		System.out.println("A duração do evento é de "+horas+" hora(s) "+minutos+" minuto(s) e "+segundos+" segundo(s)");
		
		entrada.close();
		
		
	}
}
