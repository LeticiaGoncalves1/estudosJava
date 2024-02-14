package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
	// (℉ - 32) x 5/9 = ℃

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os ℉: ");
		int F = sc.nextInt();
		
		final int n1 = 32;
		final double n2 = 5.0/9;
		final double C = (F - n1) * n2;
		
		System.out.println("A temperatura " + F + " em ℉ é equivalente à " + C + " em ℃.");
		System.out.println(C);
				
		sc.close();
		
	}

}
