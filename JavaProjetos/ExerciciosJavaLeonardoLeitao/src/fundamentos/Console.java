package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//System.out.print("Bom");
		//System.out.print(" dia!");
		
		//System.out.println("Bom");
		//System.out.println(" dia!");
		
		//int soma = 1 + 1;
		//System.out.printf("O resultado da soma de 1 mais 1 é igual a %d.", soma);
		
		//System.out.printf("Números da Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		
		//System.out.printf("Salário: %.1f\n", 2500.3762);
		
		//System.out.printf("Nome: %s %n", "João"); // %n e \n tem o mesmo efeito
		
		// int a = 3; mesma formula, tipo Scanner, nome da variável sc,
		// recebe a criação, no caso a entrada.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		sc.nextDouble();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		sc.close();
	}

}
