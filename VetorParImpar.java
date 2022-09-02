package ListaVetores;

import java.util.Scanner;

public class VetorParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int ContaPar = 0;
		int [] vet = new int[TAM];
		
		for (int x=0;x<TAM; x++) {
			System.out.println("Digite o valor da posição " + x);
			vet[x] = entrada.nextInt();
			if (vet[x]%2==0) {
				ContaPar+=1;
			}
		}
		
		int [] par = new int [ContaPar];
		int [] impar = new int[TAM-ContaPar];
		int auxiliaPar = 0;
		int auxiliaImpar = 0;
		
		for (int x=0;x<TAM; x++) {
			if (vet[x]%2==0) {
				par[auxiliaPar] = vet[x];
				auxiliaPar+=1;
			}
			else {
				impar[auxiliaImpar] = vet[x];
				auxiliaImpar+=1;
			}
		}
		System.out.println("Lista de pares: ");
		for (int x=0;x<ContaPar; x++) {
			System.out.println(par[x]);
		}
		System.out.println("Lista de ímpares: ");
		for (int x=0;(x<TAM-ContaPar); x++) {
			System.out.println(impar[x]);
		}
			
		
				
				

	}

}
