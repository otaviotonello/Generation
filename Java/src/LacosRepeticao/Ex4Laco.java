package LacosRepeticao;

import java.util.Scanner;

public class Ex4Laco {

	public static void main(String[] args) {
		/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
		�mpar exiba o n�mero elevado ao quadrado. */
		
		double a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		a = in.nextDouble();
		
		if(a%2==0) {
			System.out.println("N�mero Par!");
			System.out.println("A raiz quadrada dele �: " + Math.sqrt(a));
		} else {
			System.out.println("N�mero �mpar!");
			System.out.println("Este n�mero elevado ao quadrado �: " +  Math.pow(a,2));
		}
		
		
		in.close();

	}

}
