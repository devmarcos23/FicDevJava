
package primoOuNao;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class NumeroPrimo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        int numero = input.nextInt();
        
        if (numero == 1) {
            System.out.println("Nao e primo");
        }else if(numero == 2){
            System.out.println("E primo");
        }else{
            for(int i = 2; i < numero;i++){
                if (numero % 1 ==0) {
                    System.out.println("Nao é primo");
                    break;
                }else{
                    System.out.println("E primo");
                    break;
                }
            }
        }
         
        input.close();
        }
        
       
    }
    
