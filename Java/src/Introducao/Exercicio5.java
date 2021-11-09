package Introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int hora, min, seg, segundos;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		seg = in.nextInt();
		
	    hora = seg / 3600;
	    min = (seg % 3600) / 60;
	    segundos = (seg % 3600) % 60;

		System.out.println("A duração foi de " + hora + " horas " + min + 
							" minutos e " + segundos + " segundos.");
	    
		in.close();
	}
}
