package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //converte o Integer pra String 
													  //e mostra o tamanho
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //converte int para Integer
														   //posteriormente para string e mostra o tamanho
		
		//gambiarra do professor
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}

}
