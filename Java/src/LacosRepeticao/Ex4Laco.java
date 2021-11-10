package LacosRepeticao;

import java.util.Scanner;

public class Ex4Laco {

	public static void main(String[] args) {
		/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for 
		ímpar exiba o número elevado ao quadrado. */
		
		double a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a = in.nextDouble();
		
		if(a%2==0) {
			System.out.println("Número Par!");
			System.out.println("A raiz quadrada dele é: " + Math.sqrt(a));
		} else {
			System.out.println("Número Ímpar!");
			System.out.println("Este número elevado ao quadrado é: " +  Math.pow(a,2));
		}
		
		
		in.close();

	}

}
