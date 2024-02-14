package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//Numéricos
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // Int
		Long l = 100000L;  // Long obrigatóriamente deve 
		                   // ter o L maiúsculo no final.
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//Pontos Flutuantes
		Float f = 123.10F; // o Float obrigatóriamente deve
		                // ter o F maiúsculo no final.
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//Booleano 
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Char
		Character c = '#'; // Character é com '' áspas simples.
		System.out.println(c + "...");
	}

}
