package VetorMatriz;

import java.util.Scanner;

public class Ex3VetMat {

	public static void main(String[] args) {
		/*Faça um programa onde o usuário entre com 4 notas e o programa calcule a média.
		Obs.: utilize uma função para mostrar a média no console*/

		Scanner in = new Scanner(System.in);
		
		double[] notas = new double[4];
		double total = 0;
		int contador = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite uma nota: ");
			total += in.nextDouble();
			contador++;
		}
		
		System.out.println("\nA média é: " + calcularMedia(total, contador));
		
		in.close();
		
	}
	
	public static double calcularMedia(double total, int contador) {
		return total / contador;
	}
}
