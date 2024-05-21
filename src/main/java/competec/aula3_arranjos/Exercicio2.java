package competec.aula3_arranjos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int arj;
        double media,num1=1,num3=0;
    
        System.out.println("Digite a quantidade de números no arranjo: ");
        arj = leia.nextInt();
        double num2[] = new double[arj];
    
        for (int i = 0; i < arj; i++) {
            System.out.print("Digite o número " + (i + 1) + " do seu arranjo: ");
            num2[i] = leia.nextInt();
        }
    
        System.out.println("O arranjo tem os seguintes números:");
        for (int i = 0; i < arj; i++) {
            System.out.print(num2[i] + " ");
            num1 = num2[i]*num1;
            num3 = num2[i]+num3;
        }
        media = num3/arj;
        System.out.println("\nA média do arranjo é: " + media);
        System.out.println("\nA quantidade de números no arranjo é: " + arj);
        System.out.println("\nA multiplicação de todos os números do arranjo é igual é: " + num1);
        }
    }

