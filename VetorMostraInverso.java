package ListaVetores;

import java.util.Scanner;

public class VetorMostraInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		float [] vet = new float [TAM];
		
		for (int x=0; x<TAM; x++) {
			System.out.println("Digite o "+(x+1)+" valor do vetor");
			vet[x] = entrada.nextFloat();
		}
		System.out.println("De trás para frente: ");
		for (int x=TAM-1; x>-1; x--) {
			System.out.println(vet[x] + " ");
		}

	}

}
