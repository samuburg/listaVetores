package ListaVetores;

import java.util.Scanner;

public class QuatroNotasVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 4;
		float contador = 0;
		float media = 0;
		float [] vet = new float [TAM];
		
		for (int x=0; x<TAM; x++) {
			System.out.println("Digite a nota "+(x+1)+": ");
			vet[x] = entrada.nextFloat();
			contador+=vet[x];
		}
		media = contador/TAM ;
		System.out.println("A media entre as notas informadas é " + media);
				

	}

}
