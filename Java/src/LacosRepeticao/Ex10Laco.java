package LacosRepeticao;

import java.util.Scanner;

public class Ex10Laco {

	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner in = new Scanner(System.in);
		
		int num=0, media=0, contador=0, soma=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = in.nextInt();
			
			if(num%3==0 && num!=0) {
				contador++;
				soma = soma + num;
				media = soma/contador;
			}
			
		} while(num!=0);
		
		System.out.println("M�dia de Multiplos de 3 digitados: " + media);
		
		in.close();
	}
}
