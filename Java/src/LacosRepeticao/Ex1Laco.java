package LacosRepeticao;

import java.util.Scanner;

public class Ex1Laco {
	public static void main(String[] args) {
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int a, b, c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		a = in.nextInt();
		
		System.out.println("Digite um n�mero: ");
		b = in.nextInt();
		
		System.out.println("Digite um n�mero: ");
		c = in.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O maior n�mero �: " + a);
		} else if(b>a && b>c) {
			System.out.println("O maior n�mero �: " + b);
		} else {
			System.out.println("O maior n�mero �: " + c);
		}
		
	
		in.close();
	}
}
