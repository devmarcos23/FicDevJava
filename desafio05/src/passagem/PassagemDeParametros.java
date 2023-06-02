
package passagem;

/**
 *
 * @author Marcos
 */
public class PassagemDeParametros {

    public static void soma(int x, int y){
        int resultado = x + y;
        
        System.out.println("Resultado da soma: " + resultado);
        
        //Altera o valor do parametro x
        
        x = 0;
        
        System.out.println("Valor de x dentro do metodo: " + x);
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        System.out.println("Antes de chamar o metódo:");
        System.out.println("A= " + a + ", B= " + b);
        
        soma(a,b);
        
        System.out.println("Depois de chamar o metodo:");
        System.out.println("A= " + a + ", B= " + b);
    }
    
}
