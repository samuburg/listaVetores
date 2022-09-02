package ListaVetores;

import java.util.Scanner;

public class SenhaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String letras [] = {"a","b", "c", "d", "e", "f", "g", "h","i", "j", "k", "l"," m", "n","o", "p", "q", "r", "s", "t","u", "v", "w", "x","z"};
		String consoante [] = {"b", "c", "d", "f", "g", "h", "j", "k", "l"," m", "n", "p", "q", "r", "s", "t", "v", "w", "x","z"};
		String vogal [] = {"a", "e", "i", "o", "u"};
		int tam = 0;
		
		System.out.println("Digite o tamanho da sua senha: (max 27 letras) ");
		tam = entrada.nextInt();
		
		String [] senha = new String [tam];
		
		for (int x=(tam-1); x>=0;x--) {
			if (x%2==0) {
				senha [x] = consoante[(int) (Math.random()*consoante.length)];
			}
			else {
				senha [x] = vogal[(int) (Math.random()*vogal.length)];
			}
		}
		
		System.out.println("A sua senha é: ");
		for (int i=0;i<senha.length;i++) {
			System.out.print(senha[i]);
		}
	}
		
				

	}


