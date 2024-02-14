package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542; //limite seria 32767.
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo Caractere
		
		char status = 'A'; // ativo (O tipo char só aceita uma única letra)
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// id
		System.out.println(id + ": ganha ⇾ " + salario);
		
		// ferias
		System.out.println("Férias: " + estaDeFerias);
		
		// Status
		System.out.println("Status: " + status);

	}

}
