package ListaVetores;

import java.util.Scanner;

public class Vetor5Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int [] vet = new int [TAM];
		
		for (int x=0;x<TAM; x++) {
			System.out.print("Digite o " + (x+1) + "° valor");
			vet[x] = entrada.nextInt();
		}
		for (int x=0;x<TAM; x++) {
			System.out.println(vet[x] + "|");
		}

	}

}
