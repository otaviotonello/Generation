package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int ano, mes;
		
		System.out.println("Quantos dias você tem: ");
		int dias = in.nextInt();
		
		ano = dias/365;
		mes = (dias % 365) / 30;
		dias = (dias % 365) % 30; 

		System.out.println("Você tem " + ano + " anos, " + mes + 
		" meses e " + dias + " dias ");
		
		in.close();
	}
}
