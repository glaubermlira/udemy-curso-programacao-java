package conceitosBasicosJava;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name;
		int age;
		Double weight;
		char sexo;

		System.out.println("Informe o seu nome: ");
		name = in.nextLine();

		System.out.println("Informe o seu sexo: ");
		sexo = in.next().charAt(0);

		System.out.println("Digite sua idade: ");
		age = in.nextInt();

		System.out.println("Digite o seu peso: ");
		weight = in.nextDouble();

		System.out.println(
				"Usuário: " + name + "\nSexo: " + sexo + "\nIdade: " + age + " anos" + "\nPeso: " + weight + " Kg");

		in.close();// ENCERRAR RECURSO;

	}

}
