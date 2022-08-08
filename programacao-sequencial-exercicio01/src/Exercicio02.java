//	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int diasTotal, anos, meses, dias;
		
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.print("Insira sua idade em dias: ");
		diasTotal = entrada.nextInt();
		
		anos = diasTotal/365;
		
		meses = (diasTotal%365)/30;
		
		dias = (diasTotal%365)%30;
		
		System.out.println("Sua idade é de "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dia(s)");
		
		entrada.close();
		
		
	}
	
}
