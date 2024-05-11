package competec.aula2_loops;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int num, mult, resut;

    System.out.println("Digite o número da tabuada");
    num = leia.nextInt();
    
    for (mult = 1; mult<=10 ; mult++){
        resut = num * mult;
        System.out.println("o resultado da multiplicação por: " + mult + " é igual à: " + resut);
        }
    }        
}
