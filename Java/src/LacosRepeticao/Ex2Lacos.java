package LacosRepeticao;

import java.util.Scanner;

public class Ex2Lacos {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);

		    int x, y, z;
		
		    System.out.print("Digite o primeiro n�mero: ");
		    x = sc.nextInt();
		
		    System.out.print("Digite o segundo n�mero: ");
		    y = sc.nextInt();
		
		    System.out.print("Digite o terceiro n�mero: ");
		    z = sc.nextInt();
		
		    if (x < y && y < z) {
		        System.out.println("\nOrdem crescente: " + x + ", " + y + " e " + z);
		    }
		
		    else if (y > x && x > z) {
		        System.out.println("\nOrdem crescente: " + z + ", " + x + " e " + y);
		    }
		
		    else if (y < x && x < z) {
		        System.out.println("\nOrdem crescente: " + y + ", " + x + " e " + z);
		    }
		
		    else if (y > x && z > x) {
		        System.out.println("\nOrdem crescente: " + x + ", " + z + " e " + y);
		    }
		
		    else if (z > y && x > z) {
		        System.out.println("\nOrdem crescente: " + y + ", " + z + " e " + x);
		    }
		
		    else if (z < x && y < x) {
		        System.out.println("\nOrdem crescente: " + z + ", " + y + " e " + x);
		    }
		
		    else if (x == y && z > x) {
		        System.out.println("\nOrdem crescente: " + x + ", " + y + " e " + z);
		    }
		
		    else if (x == z && y > x) {
		        System.out.println("\nOrdem crescente: " + x + ", " + z + " e " + y);
		    }
		
		    else if (x == y && z < x) {
		        System.out.println("\nOrdem crescente: " + z + ", " + y + " e " + x);
		    }
		
		    else if (x == z && y < x) {
		        System.out.println("\nOrdem crescente: " + y + ", " + z + " e " + x);
		    } 
		
		    else {
		           System.out.println("\nOrdem crescente: " + x + ", " + z + " e " + y);
		    }
		
		    sc.close();
		    
	}

}
