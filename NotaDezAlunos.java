package ListaVetores;

import java.util.Scanner;

public class NotaDezAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
		
		final int NNOTAS = 3;
		final int NALUNOS = 3;
		float ContaMedia = 0;
		float [] media = new float[NALUNOS];
		float nota = 0;
		int contador = 0;
		
		for (int i=0;i<NALUNOS;i++) {
			ContaMedia = 0;
			for (int x=0; x<NNOTAS; x++) {
				System.out.println("Digite a nota" + (x+1) +" do aluno " + (i+1)+": ");
				nota = entrada.nextFloat();
				ContaMedia +=nota;
				if ((x == NNOTAS-1)) {
					media[i] = ContaMedia/NNOTAS;
					if (media[i]>=7) {
						contador+=1;
					}
				}
			}
		}
		
		System.out.println("Media dos alunos");
		for (int x=0; x<NALUNOS;x++) {
			System.out.print(media[x]+ "|");
		}
		System.out.println("");
		System.out.println(contador + " Alunos obtiveram nota igual ou maior que sete!");
				

	}

}