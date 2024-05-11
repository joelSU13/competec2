package competec.aula2_loops;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int senha = 100, num=0;
    System.out.println("Digite sua senha: ");
    num = leia.nextInt();
    
    while (num != senha){
        System.out.println("Sua senha está incorreta porfavor digite novamente");
    num = leia.nextInt();
    }
    System.out.println("Sua senha está correta");
        
    }
}
