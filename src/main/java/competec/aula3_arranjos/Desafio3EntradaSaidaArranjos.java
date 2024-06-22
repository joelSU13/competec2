package competec.aula3_arranjos;

import java.util.Scanner;

public class Desafio3EntradaSaidaArranjos {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int j=0;
		System.out.println("Digite um valor para o seu arranjo: ");
		j=leia.nextInt();
		int numeros[]=new int [j];

		for(int i=0;i<j;i++) {
			System.out.println("Digite um número para o seu arranjo: ");
            numeros[i]=leia.nextInt();
4
        }
		for(int i=0;i<numeros.length;i++) {
            System.out.println(numeros[i]);
        }


		// Coletar tamanho arranjo

		// Preencher arranjo

		// Impremir arranjo

		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */

	}

}
