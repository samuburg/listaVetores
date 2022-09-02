package ListaVetores;

import java.util.Scanner;

public class ValidarDataVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [] vet = new int [3];
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		while (dia==0 || dia>31) {
			System.out.println("Por favor, digite o dia: ");
			dia = entrada.nextInt();
			}
		vet[0] = dia;
		
		while (mes==0 || mes>12) {
			System.out.println("Por favor, digite o mes: ");
			mes = entrada.nextInt();
			}
		vet[1] = mes;
		
		while (ano<1900 || ano>2100) {
			System.out.println("Por favor, digite o ano: ");
			ano = entrada.nextInt();
			}
		vet[2] = ano;
		
		for (int x=0;x<vet.length;x++) {
			System.out.print(vet[x] + "/");
		}
		

			
			
			
			
	}
		

	}


