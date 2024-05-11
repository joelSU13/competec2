package competec.aula2_loops;

public class exercicio1
{
	public static void main(String[] args) {
    int soma = 0, num = 0;
    
    do {
    num = num + 1;
    soma = soma + num;
    
    System.out.println(num + "-" + soma );
    }   while (num<100);	
        
    
        
    }
}