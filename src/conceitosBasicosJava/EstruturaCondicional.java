package conceitosBasicosJava;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int hora;

		System.out.println("Qual horas?");
		hora = in.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!!");
		} else {
			System.out.println("Boa noite!!!");
		}

		in.close();

	}

}
