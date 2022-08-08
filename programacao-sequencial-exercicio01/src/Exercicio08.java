//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
//dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 


import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
	
	
	double custoConsumidor, custoFabrica, porcentagemDistribuidor, impostos;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o valor do custo de fábrica do carro: ");
	custoFabrica=entrada.nextDouble();
	
	porcentagemDistribuidor = custoFabrica*0.28;
	impostos = custoFabrica*0.45;
	
	custoConsumidor = custoFabrica+porcentagemDistribuidor+impostos;
	
	System.out.println("O custo ao consumidor será de: R$ "+custoConsumidor);
	
	entrada.close();
	

	}
}
