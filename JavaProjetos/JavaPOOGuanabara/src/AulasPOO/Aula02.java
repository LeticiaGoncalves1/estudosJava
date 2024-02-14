package AulasPOO;

public class Aula02 {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() { //void porque não retorna nada (vazio)
		if (this.tampada == true) {
			System.out.println("Erro! A tampa está fechada, não posso rabiscar.");
		}else {
			System.out.println("Estou rabiscando... 🖊️✨");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}

}
