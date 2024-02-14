package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de média salarial");
		System.out.println();
		
		System.out.println("Digite o primeiro salário: ");
		String n1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salário: ");
		String n2 = sc.nextLine().replace(",", ".");;
		
		System.out.println("Digite o terceiro salário: ");
		String n3 = sc.nextLine().replace(",", ".");;

		double s1 = Double.parseDouble(n1);
		double s2 = Double.parseDouble(n2);
		double s3 = Double.parseDouble(n3);
		
		double soma	= (s1 + s2 + s3);
		double media = (soma / 3);
		
		System.out.println("A média salarial é " + media);
		
		sc.close();
		
	}

}
