//7. Um sistema de equações lineares do tipo: ax + by = c
//											dx + ey = f
//   pode ser resolvido segundo mostrado abaixo: 
//	   
//	   x = (ce - bf)/(ae-bd)
//	   
//	   y = (af-cd)/(ae-bd)



import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
	
	
	double a, b, c, d, e, f, x, y;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite os valores pra cada um dos coeficientes abaixo: ");
	System.out.print("a: ");
	a = entrada.nextDouble();
	System.out.print("b: ");
	b = entrada.nextDouble();
	System.out.print("c: ");
	c = entrada.nextDouble();
	System.out.print("d: ");
	d = entrada.nextDouble();
	System.out.print("e: ");
	e = entrada.nextDouble();
	System.out.print("f: ");
	f = entrada.nextDouble();
	
	x = (c*e - b*f)/(a*e - b*d);
	y = (a*f - c*d)/(a*e - b*d); 
	
	System.out.println("Valor de x: "+x+"\nValor de y: "+y);
	
	entrada.close();
	
	
	
	}
}
