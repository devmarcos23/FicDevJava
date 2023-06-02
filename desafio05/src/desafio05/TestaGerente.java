
package desafio05;

/**
 *
 * @author Marcos
 */
public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        
        g1.setNome("Flavin do pneu");
        g1.setSenha(1234);
        
        g1.setSalario(1000.0);
       
        System.out.println( "Sua bonificacao no valor de: " + g1.getBonificacao());
    }
}
