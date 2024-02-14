package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		//System.out.println("Olá pessoal".charAt(2));

		//String s = "Boa tarde";
		// s = s.toUpperCase();
		// s = "Bom dia";
		
		//System.out.println(s.concat("!!!"));
		//System.out.println(s + "!!!");
		//System.out.println(s.startsWith("Boa"));
		//System.out.println(s.toLowerCase().startsWith("boa"));
		//System.out.println(s.endsWith("tarde"));
		//System.out.println(s.length());
		//System.out.println(s.equals("boa tarde")); // verifica se é igual
		//System.out.println(s.equalsIgnoreCase("boa tarde")); // verifica se é igual ignorando o Capslock
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987F;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
		+ sobrenome + "\nIdade: " + idade + 
				"\nSalário: " + salario);
		System.out.println();
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome, sobrenome, idade, salario);
		System.out.println();
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		System.out.println();
		
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade
				+ "\nSalário: " + salario;
		System.out.println(maisUmaFrase);
		System.out.println();
		
		System.out.println("frase qualquer".contains("qual"));
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("frase qualquer".substring(6,  10));
		
		
	}

}
