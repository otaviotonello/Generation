package LacosRepeticao;

import java.util.Scanner;

public class Ex2Lacos {

	public static void main(String[] args) {
		//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		double a, b, c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		a = in.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		b = in.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		c = in.nextDouble();
		
		if(a<b && b<c) {
			System.out.println("Ordem crescente: " + a + " " + b + " " + c);
		} else if(a<b && c<b) {
			System.out.println("Ordem crescente: " + a + " " + c + " " + b);
		} else if(b<a && a<c) {
			System.out.println("Ordem crescente: " + b + " " + a + " " + c);
		} else if(b<a && c<a) {
			System.out.println("Ordem crescente: " + b + " " + c + " " + a);
		} else if(c<b && b<a) {
			System.out.println("Ordem crescente: " + c + " " + b + " " + a);
		} else {
			System.out.println("Ordem crescente: " + c + " " + a + " " + b);
		}
		
		
		
		
		in.close();
	}

}
