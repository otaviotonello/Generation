package Introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		double x1, x2, y1, y2, d, raiz; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite x1: ");
		x1 = in.nextDouble();
		
		System.out.println("Digite x2: ");
		x2 = in.nextDouble();
		
		System.out.println("Digite y1: ");
		y1 = in.nextDouble();
		
		System.out.println("Digite y2: ");
		y2 = in.nextDouble();
		
		d = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		
		raiz = Math.sqrt(d);
		
		System.out.println("Resultado: " + raiz);
		
		in.close();
	}
}
