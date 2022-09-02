package ListaVetores;

import java.util.Scanner;

public class IdadeAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 3;
		int maisAlto = 0;
		int menor = 0;
		int maisVelho=0;
		int maisNovo = 0;
		int [] idade = new int [TAM];
		int [] altura = new int [TAM];
		
		for (int x=0;x<TAM;x++) {
			System.out.println("Digite a idade do cidadão "+(x+1)+" :");
			idade [x] = entrada.nextInt();
			System.out.println("Digite a altura do cidadão "+(x+1)+" :");
			altura [x] = entrada.nextInt();
			if (x==0) {
				maisAlto = altura[x];
				menor = altura[x];
				maisVelho = idade[x];
				maisNovo = idade[x];
			}
			else {
				//switch (idade[x]){
				//case idade[x]>maisAlto:
					maisAlto = altura[x];
				
				}
			}
		//}
		
		for (int x=(TAM-1);x>=0;x--) {
			System.out.print(idade[x] + "|");
			System.out.print(altura[x]+ "|");
		}

	}

}
