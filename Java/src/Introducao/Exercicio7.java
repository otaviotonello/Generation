package Introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		double a, b, c, d, e, f, x, y;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite A: ");
		a = in.nextDouble();
		
		System.out.println("Digite B: ");
		b = in.nextDouble();
		
		System.out.println("Digite C: ");
		c = in.nextDouble();
		
		System.out.println("Digite D: ");
		d = in.nextDouble();
		
		System.out.println("Digite E: ");
		e = in.nextDouble();
		
		System.out.println("Digite F: ");
		f = in.nextDouble();
		
		x = (((c*e) - (b*f)) / ((a*e) - (b*d)));
		y = (((a*f) - (c*d)) / ((a*e) - (b*d)));
		
		System.out.println("Valor de x: " + x + "Valor de y: " + y);

		
		in.close();
	}

}
