package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicalização
		System.out.println("A = " + a);
		
		var b = 4.5; // var seria tipo vago, o que você coloca, define ele
		System.out.println("B = " + b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicalizada
		System.out.println(d); // usada
		
		var e = 123.45;
		System.out.println("E = " + e);
		
		var f = 12; // inteiro
		// f = 12.01;
		System.out.println("F = " + f);
	}

}
