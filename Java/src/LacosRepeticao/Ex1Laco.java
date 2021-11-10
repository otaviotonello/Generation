package LacosRepeticao;

import java.util.Scanner;

public class Ex1Laco {
	public static void main(String[] args) {
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int a, b, c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a = in.nextInt();
		
		System.out.println("Digite um número: ");
		b = in.nextInt();
		
		System.out.println("Digite um número: ");
		c = in.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O maior número é: " + a);
		} else if(b>a && b>c) {
			System.out.println("O maior número é: " + b);
		} else {
			System.out.println("O maior número é: " + c);
		}
		
	
		in.close();
	}
}
