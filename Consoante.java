package ListaVetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		final int TAM = 10;
		String [] vet = new String[TAM];
		ArrayList<String> consoante = new ArrayList();
		String vogais [] = {"a","e","i","o","u"};
		int contador = TAM;
		
		for (int x = 0; x<TAM; x++) {
			System.out.println("Digite o caractere numero "+x+ " : ");
			vet[x] = entrada.next();
			consoante.add(vet[x]);
			for (int i=0; i<vogais.length;i++)
				if (vogais[i].equals(vet[x])) {
					contador-=1;
					consoante.remove(vet[x]);
		
					
				}
		}
		System.out.println("Total de consoantes: " + contador);
		System.out.println("Consoantes digitadas: ");
		System.out.println(consoante);
		//for (int x = 0; x<contador; x++) {
			//System.out.println(consoante.get(x));
		
		
		

	}

}
