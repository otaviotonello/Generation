package LacosRepeticao;

import java.util.Scanner;

public class Ex8Laco {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)*/
		
		Scanner in = new Scanner(System.in);
		
		int i=0, idade=0, sexo=0, personalidade=0, pessoasCalmas=0, hAgressivo=0, mNerv=0;
		int oCalmo=0, pNerv40=0, pCalm18=0;
		
		
		while(i<4) {
			for(i=0; i<4; i++) {
				System.out.print("Olá, digite a sua idade: ");
				idade = in.nextInt();
				
				System.out.print("Agora digite seu sexo (1-fem/2-mas/3-outros): ");
				sexo = in.nextInt();
				
				System.out.println("Você se considera como ? (1-Calmo/2-Nervoso/3-Agressivo): ");
				personalidade = in.nextInt();
				
				if (personalidade==1) {
					pessoasCalmas++;
				} else if (sexo==2 && personalidade==3) {
					hAgressivo++;
				} else if (sexo==1 && personalidade==2) {
					mNerv++;
				} else if (sexo==3 && personalidade==1) {
					oCalmo++;
				} else if (personalidade==2 && idade>40) {
					pNerv40++;
				} else if (personalidade==1 && idade<18) {
					pCalm18++;
				}
			}
			
			in.close();
		}
		
		System.out.println("Pessoas Calmas: " + pessoasCalmas);
		System.out.println("Mulheres Nervosas: " + mNerv);
		System.out.println("Homens Agressivos: " + hAgressivo);
		System.out.println("Outros Calmos: " + oCalmo);
		System.out.println("Pessoas Nervosas com mais de 40 anos: " + pNerv40);
		System.out.println("Pessoas Calmas com menos de 18 anos: " + pCalm18);
		
	}

}
