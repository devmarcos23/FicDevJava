
package internaExterna;

public class Externa {
    private final int valor = 10;
    
    public class Interna{
        public void imprimaValor(){
            
            System.out.println("O valor da classe interna é: " + valor);
        }
    }
    
    public static void main(String[] args) {
        Externa externaA = new Externa();
        
        Externa.Interna interna = externaA.new Interna();
        
        interna.imprimaValor();
        
        
    }
}
