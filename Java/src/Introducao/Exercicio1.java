package Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Quantos anos voc� tem?");
		int anos = in.nextInt();
		
		System.out.println("Quantos meses voc� tem?");
		int meses = in.nextInt();	
		
		System.out.println("Quantos dias voc� tem?");
		int dias = in.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		
		int res = anos + meses + dias;
		
		System.out.println("Voc� tem: " + res+ "dias na terra.");
		
		in.close();
	}

}
