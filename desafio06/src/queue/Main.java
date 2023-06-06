
package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


/**
 *
 * @author Marcos
 */
public class Main {

   
    public static void main(String[] args) {
        //Instanciando objeto do tipo Queue
        Queue<Carro> fila = new LinkedList<Carro>();
        fila.add(new Carro("toyota", "corolla", 2020));
        fila.add(new Carro("honda", "civic", 2020));
        fila.add(new Carro("chevrolet", "onix", 2020));
        
        for(Carro tipo: fila){
            JOptionPane.showMessageDialog(null, fila.toString());
        }
        JOptionPane.showMessageDialog(null, "Remove o primero carro: " + fila.remove());
        
        //Instanciando objeto do tipo HashMap
        
        HashMap <String, Integer> idades = new HashMap<String, Integer>();
        
        idades.put("Marcos", 45);
        idades.put("Bob", 30);
        idades.put("Charlie", 34);
        
        for(String nome: idades.keySet()){
            Integer idade = idades.get(nome);
            JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos.");
        }
    }
    
}
