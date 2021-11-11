package LacosRepeticao;

import java.util.Scanner;

public class Ex6Laco {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares 
		// e quantos são ímpares. (FOR)
		
		Scanner in = new Scanner(System.in);
		
		int num=0, par=0, impar=0, i;
		
		for(i=0; i<=10; i++) {
			System.out.println("Digite um número: ");
			num = in.nextInt();
			
			if(num%2==0) {
				par++;
			} else {
				impar++;
			}
			
			in.close();
		}
		
		System.out.println("Números Pares: " + par);
		System.out.println("Números Ímpares: " + impar);
		
		in.close();
	}

}
