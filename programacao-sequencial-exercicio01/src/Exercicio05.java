//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente. 



import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double n1, n2, n3, mediaPonderada;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.print("Digite o valor da segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.print("Digite o valor da terceira nota: ");
		n3 = entrada.nextDouble();
		
		mediaPonderada = ((n1*2) + (n2*3) + (n3*5)) / 10;
		
		System.out.println("A média ponderada do aluno é de : "+mediaPonderada);
		
		entrada.close();
		
	}
}
