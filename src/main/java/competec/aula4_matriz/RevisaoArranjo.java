package competec.aula4_matriz;

import java.util.Scanner;

public class RevisaoArranjo {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeros[] = new int [10];
        int maior;
        int menor;
        int maior1=0;
        int menor1=0;

        for(int i=0;i<=9;i++) {
            System.out.println("Digite um valor para o seu arranjo: ");
            numeros[i]=leia.nextInt();
            System.out.println(numeros[i]);
        }
        menor=numeros[0];
        maior=numeros[0];
            for(int k=0;k<=9;k++) {
                if(maior<numeros[k]) {
                    maior1=numeros[k];
                }
            }
                    for(int m=0;m<=9;m++) {
                        if(menor>numeros[m]) {
                            menor1=numeros[m];                    
                         } 
                        }
                        System.out.println(maior1);
                        System.out.println(menor1);

    }
}
