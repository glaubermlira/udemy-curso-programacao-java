package exe_part01_estrutSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

//		EXERCICIO 01

		Scanner in = new Scanner(System.in);

//		int x, y, result;
//		
//		System.out.println("Digite um numero inteiro qualquer: ");
//		x = in.nextInt();
//		
//		System.out.println("Digite outro numero inteiro qualquer: ");
//		y = in.nextInt();
//		
//		result = x + y;
//		System.out.println("A soma dos dois numeros digitados é igual a: " + result);

//		EXERCICIO 02

//		Double areaCirculo, raio, pi = 3.14159;
//		
//		System.out.println("Informe o valor do raio do círculo: ");
//		raio = in.nextDouble();
//		
//		areaCirculo = pi * (raio * raio);
//		
//		System.out.printf("A área desse círculo é igua a: " + "%.4f%n",areaCirculo); //Imprimir 4 casas decimais;

//		EXERCICIO 03

//		int a, b, c, d, diferenca;
//		
//		System.out.println("Digite um numero inteiro: ");
//		a = in.nextInt();
//		System.out.println("Digite outro numero inteiro: ");
//		b = in.nextInt();
//		System.out.println("Digite mais um numero inteiro: ");
//		c = in.nextInt();
//		System.out.println("Digite o ultimo numero inteiro: ");
//		d = in.nextInt();
//		
//		diferenca = (a * b) - (c * d);
//		
//		System.out.println("A diferença do produto entres os quatro números informados é igual a: " + diferenca);

//		EXERCICIO 04

//		int matricula = in.nextInt();
//		Double horasTrab = in.nextDouble();
//		Double valorHora = in.nextDouble();
//		Double salario = horasTrab * valorHora;
//		
//		System.out.printf("MATRICULA: " + matricula + "\nSALARIO: U$ %.2f%n", salario);
//		

//		EXERCICIO 05

//		int cod1 = in.nextInt();
//		int numPecas1 = in.nextInt();
//		Double valorUnit1 = in.nextDouble();
//		
//		int cod2 = in.nextInt();		
//		int numPecas2 = in.nextInt();		
//		Double valorUnit2 = in.nextDouble();
//		
//		Double total = (valorUnit1 * numPecas1) + (valorUnit2 * numPecas2);
//		
//		System.out.printf("VALOR A SER PAGO: %.2f%n", total);

//		EXERCICIO 06

		Double a, b, c, arTriRet, arCircle, arTrap, arQuad, arRet, pi = 3.14159;

		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		arTriRet = (a * c) / 2.0;
		arCircle = pi * (c * c);
		arTrap = ((a + b) * c) / 2.0;
		arQuad = b * b;
		arRet = a * b;

		System.out.printf("TRIANGULO: %.3f%n", arTriRet);
		System.out.printf("CIRCULO: %.3f%n", arCircle);
		System.out.printf("TRAPEZIO: %.3f%n", arTrap);
		System.out.printf("QUADRADO: %.3f%n", arQuad);
		System.out.printf("RETANGULO: %.3f%n", arRet);

		in.close();

	}

}
