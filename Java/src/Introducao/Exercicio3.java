package Introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int a, b, c, r, s, d;
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		a = in.nextInt();
		
		System.out.println("Outro n�mero: ");
		b = in.nextInt();
		
		System.out.println("Outro n�mero: ");
		c = in.nextInt();
		
		r = ((a+b)*(a+b));
		s = ((b+c)*(b+c));
		d = (r+s)/2;

		System.out.println("Resultado arredondado: " + d);
		
		in.close();
	}

}
