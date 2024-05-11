package competec.aula2_loops;

import java.util.Scanner;

public class exercicio4 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int num;
        
            System.out.println("Digite um número");
            num = leia.nextInt();
            
            for (int imp = 1 ; imp<=num ; imp += 2){
                System.out.println("Os números impares até " + num + " são iguais à: " +imp);
                }
            }        
        }
