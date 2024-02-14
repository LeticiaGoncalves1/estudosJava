package AulasPOO;

public class Aula01 {
	public static void main(String[] args) { //Método main
		
		Aula02 c1 = new Aula02(); //objeto c1 que instancia uma nova classe de caneta
		
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; // definida como private
		c1.carga = 80;
		c1.tampada = true;
		
		c1.status();
	}

}


