package Introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		double nota1, nota2, nota3, media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = in.nextDouble();
		
		media = (((nota1*2) + (nota2*3) + (nota3*5)) / 3);
		
		System.out.println("A media ponderada é: " + media);
		
		in.close();
	}
}
