package fundamentos;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Digite o primeiro valor para somar: ");
		String n2 = JOptionPane.showInputDialog("Digite o segundo valor para somar: ");
		
		double numero1 = Double.parseDouble(n1);
		double numero2 = Double.parseDouble(n2);
		
		double soma = numero1 + numero2;
		double media = soma / 2;
		
		String txt = "Sua média é: " + media;
		
		JOptionPane.showMessageDialog(null, txt);
		
	}

}
