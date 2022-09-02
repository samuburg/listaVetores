package ListaVetores;

import java.util.Scanner;

public class SomaMultVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int [] vet = new int [TAM];
		int multiplica = 1;
		int soma = 0;
		
		for (int x=0; x<TAM; x++) {
			System.out.println("Digite o valor da posição " + x + " : ");
			vet[x] = entrada.nextInt();
			multiplica *=vet[x];
			soma+=vet[x];
		}
		
		System.out.println("Valores digitados : ");
		for (int x=0; x<TAM; x++) {
			System.out.print(vet[x] + "|");	
		}
		System.out.println("");
		System.out.println("Todos valores multiplicados: " + multiplica);
		System.out.println("Todos valores somados : " + soma);

	}

}
