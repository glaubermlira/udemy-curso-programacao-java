package exe_part02_estrutCondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(System.in);

//		EXERCICIO 01;

//		int numInt;
//		
//		numInt = in.nextInt();
//		
//		if (numInt >= 0) {
//			System.out.println("NÃO NEGATIVO");
//		} else {
//			System.out.println("NEGATIVO");
//		}

//		EXERCICIO 02;
//		int number;
//		
//		number = in.nextInt();
//		
//		if (number % 2 == 0) {
//			System.out.println("PAR");
//		} else {
//			System.out.println("IMPAR");
//		}

//		EXERCICIO 03;
//		int valueA, valueB;
//		
//		System.out.println("Informe um valor: ");
//		valueA = in.nextInt();
//		
//		System.out.println("Informe outro valor: ");
//		valueB = in.nextInt();
//		
//		if ((valueA % valueB == 0) || (valueB % valueA == 0)) {
//			System.out.println("SÃO MÚLTIPLOS");
//		} else {
//			System.out.println("NÃO SÃO MÚLTIPLOS");
//		}

//		EXERCICIO 04;
//		int horaInicial = in.nextInt();
//		int horaFinal = in.nextInt();
//		
//		int duracaoJogo;
//		
//		if (horaInicial < horaFinal) {
//			duracaoJogo = horaFinal - horaInicial;
//		} else {
//			duracaoJogo = 24 - horaInicial + horaFinal;
//		}
//		
//		System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");

//		EXERCICIO 05;
//		int cod, qtdeProduto;
//		double totalPagar;
//		
//		System.out.println("Digite o código do produto: ");
//		cod = in.nextInt();
//		
//		System.out.println("Informe a quantidade: ");
//		qtdeProduto = in.nextInt();
//		
//		if (cod == 1) {
//			totalPagar = qtdeProduto * 4.00;
//		} else if (cod == 2) {
//			totalPagar = qtdeProduto * 4.50;
//		} else if (cod == 3) {
//			totalPagar = qtdeProduto * 5.00;
//		} else if (cod == 4) {
//			totalPagar = qtdeProduto * 2.00;
//		} else {
//			totalPagar = qtdeProduto * 1.50;
//		}
//		
//		System.out.printf("TOTAL: R$ %.2f%n",totalPagar);

//		EXERCICIO 06;
//		System.out.println("Informe um valor: ");
//		double valor = in.nextDouble();
//		
//		if(valor > 0.00 && valor <= 25.00) {
//			System.out.println("INTERVALO [0,25]");
//		} else if (valor > 25.00 && valor <= 50.00) {
//			System.out.println("INTERVALO [25,50]");
//		} else if (valor > 50.00 && valor <= 75.00) {
//			System.out.println("INTERVALO [50,75]");
//		} else if (valor > 75.00 && valor <= 100.00) {
//			System.out.println("INTERVALO [75,100]");
//		} else {
//			System.out.println("FORA DE INTERVALO!");
//		}

//		EXERCICIO 07;

		in.close();

	}

}
