package ListaVetores;

import java.util.Scanner;

public class TextoParaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		System.out.println("Digite o texto desejado: ");
		texto = entrada.next();
		
		String vet[] = texto.split("");
		
		for (int x=0; x<texto.length();x++) {
			System.out.print(vet[x] + "|");
		}
		
		

	}

}
