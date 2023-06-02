
package menuDeBebidas;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcos
 */
public class bebidas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp;
        
        do {
            System.out.println("passei");
            String resp1 = JOptionPane.showInputDialog("Bem Vindo"
                    + "\nEscolha as opcoes de menu:"
                    + "\n[1]-Coca lata"
                    + "\n[2]-Fanta lata"
                    + "\n[3]-Shot de Whisky"
                    + "\n[4]-Agua de Coco"
                    + "\n[5]-Copo de Cafe 200ML");
            
            switch (resp1) {
                case "1":
                    System.out.println();
                    JOptionPane.showMessageDialog(null, "Valor R$ 4,50");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Valor R$ 5,00");

                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Valor R$ 10,00");

                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Valor R$ 8,00");

                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Valor R$ 3,00");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
            
            resp = JOptionPane.showInputDialog("Deseja continuar? S/N: ").charAt(0);
            
            
        } while (resp != 'n');
    }
}
