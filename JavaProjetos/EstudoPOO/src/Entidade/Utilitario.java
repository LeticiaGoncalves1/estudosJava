package Entidade;

public class Utilitario {
	
	
	
	

	public static int calculoSoma(int valorA, int valorB) {
		int resultado = valorA + valorB; 
		return resultado;
	}
	
	
	public static double porcentagem(double salario, double aumento) {
		
		double porcento = salario * aumento / 100;
		double novoSalario = salario + porcento;
		
		return novoSalario;
		
	}
	
	public static double media (double nota1, double nota2, double nota3) {
		
		double soma = nota1 + nota2 + nota3;
		double notaMedia = soma / 3;
		
	return notaMedia;	
	
	}
	
	
	
	
	
}
