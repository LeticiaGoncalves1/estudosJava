package aplicacao;

import java.util.Scanner;

import Entidade.Utilitario;

public class Main {

	public static void main(String[] args) {
// tipo classe  e ao lado  nome da variavel
		Utilitario botao = new Utilitario();
		Scanner sc = new Scanner(System.in);	
		
		//executa uma soma
		//System.out.println(botao.calculoSoma(10, 7));
		
		//--------------------------------------------------
		
		//faz a porcentagem do aumento de salario
		//System.out.println("Qual o seu salário?");
		//Double salario = sc.nextDouble();
		
		//System.out.println("Qual a porcentagem do aumento?");
		//Double porcento= sc.nextDouble();
		
		//System.out.println(botao.porcentagem(salario, porcento));
		
		//--------------------------------------------------
		
		//calculo da media
		System.out.println(botao.media(sc.nextDouble(), sc.nextDouble(), sc.nextDouble())); {
			
		
			
		}
		
		
		sc.close();
	}

}
