package conceitosBasicosJava;

import java.util.Locale;

public class Introducao {

	public static void main(String[] args) {
		/*
		 * String name = "Glauber"; int idade = 35; double altura = 1.88; char sexo =
		 * 'F'; boolean aprovado = true;
		 * 
		 * double number = 10.05846641888;
		 * 
		 * System.out.printf("%.4f%n", number); //Imprimir numero configurando as casas
		 * decimais;
		 * 
		 * Locale.setDefault(Locale.US);//Configurar o indioma padrão do programa;
		 * 
		 * System.out.printf("%.4f%n", number);
		 * 
		 * System.out.println("Usuario: " + name + "\n" + "Idade: " + idade + " anos\n"
		 * + "Altura: " + altura + "m\n" + "Sexo: " + sexo +"\n"+ "Situação: "+ aprovado
		 * );
		 */
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.print("Products:\n");
		System.out.printf(product1 + ", which price is $ %.2f",price1);
		System.out.printf("\n" + product2 + ", which price is $ %.2f",price2);
		
		
		System.out.println("\n\nRecord: " + age + " years old, code " + code + " and gender: " + gender);
		
		System.out.printf("%nMeasue with eight decimal places: %.8f", measure);
		System.out.printf("%nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", measure);


	}

}
