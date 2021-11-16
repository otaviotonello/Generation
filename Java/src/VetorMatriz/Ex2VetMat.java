package VetorMatriz;

import java.util.Scanner;

public class Ex2VetMat {
	  public static void main(String[] args) {

//        Faça um programa onde o usuário entre com 4 notas de 3 alunos diferentes e o programa mostre as médias.

        Scanner in = new Scanner(System.in);

        int alunos = 3;
        int notas = 4;
        double somatoria = 0;
        double[][] total = new double[alunos][notas];

        System.out.println("--- COLETANDO AS NOTAS ---");
        System.out.println("");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("NOTA " + (coluna + 1) + " - ALUNO " + (linha + 1) + ": ");
                total[linha][coluna] = in.nextDouble();
            }
            System.out.println("--------------------------");
        }

        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("--- CALCULANDO A MÉDIA ---");
        System.out.println("");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                somatoria += total[linha][coluna];
            }
            System.out.println("MÉDIA ALUNO " + (linha + 1) + ": " + somatoria / notas);
            somatoria = 0;
        }

        System.out.println("--------------------------");

        in.close();

    }
}

