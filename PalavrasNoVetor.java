package ListaVetores;

import java.util.ArrayList;
import java.util.Scanner;

public class PalavrasNoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		int contador = 0; 
		
		System.out.println("Digite uma sequencia de nomes separados por ponto e vírgula (;): ");
		texto= entrada.next();
		
		for (int x=0;x<texto.length();x++) {
			if (charAt( x)==";") {
				contador+=1;
			}
		}
		
		String [] vet = new String[contador+1];
		vet = texto.split(";");
		
		for (int x=0;x<vet.length;x++) {
			System.out.println(vet[x]);
		}
		
		
		
			
	
	
		
		

	}

	private static String charAt(int x) {
		// TODO Auto-generated method stub
		return null;
	}

}
