package inicio;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Seja Bem-Vindo(a)!");
		
		System.out.println("Me informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Qual sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Qual sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Informações recebidas: Seu nome é " + nome + ", sua idade é " + idade + ", sua altura é " + altura);
		
		System.out.println("Fim do programa.");
	sc.close();			
	}

}
