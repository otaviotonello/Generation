package LacosRepeticao;

import java.util.Scanner;

public class Ex6Laco {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares 
		// e quantos s�o �mpares. (FOR)
		
		Scanner in = new Scanner(System.in);
		
		int num=0, par=0, impar=0, i;
		
		for(i=0; i<=10; i++) {
			System.out.println("Digite um n�mero: ");
			num = in.nextInt();
			
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
			
			in.close();
		}
		
		System.out.println("N�meros Pares: " + par);
		System.out.println("N�meros �mpares: " + impar);
		
		in.close();
	}

}
