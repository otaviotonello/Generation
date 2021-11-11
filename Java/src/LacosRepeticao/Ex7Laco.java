package LacosRepeticao;

import java.util.Scanner;

public class Ex7Laco {
	public static void main(String[] args) {
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		Scanner in = new Scanner(System.in);
		
		int pessoa21 = 0, pessoa50 = 0, idade = 0, i=0;
		
		while(i<=5) {
			for(i=0; i<=5; i++) {
				System.out.println("Digite a sua idade: ");
				idade = in.nextInt();
				
				if(idade<21) {
					pessoa21++;
				} else if(idade>50){
					pessoa50++;
				}
			}
			
			System.out.println("Pessoas com menos de 21 anos: " + pessoa21);
			System.out.println("Pessoas com mais de 50 anos: " + pessoa50);
			
		}
		
		in.close();
		
	}
}
