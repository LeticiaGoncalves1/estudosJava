package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;  // final define a variável como imutável.
									// ao definir uma variável como imutavel, ela se torma uma CONSTANTE, e por conversão, é escrita com letras maiusculas.
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		// System.out.println(pi * raio * raio);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Area = " + area + " m².");
		
	}

}
