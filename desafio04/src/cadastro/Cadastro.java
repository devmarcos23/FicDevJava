
package cadastro;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcos
 */
public class Cadastro {
    public static void main(String[] args) {
        String vetorAlunos[][] = new String[2][3];
        double somaNotas = 0;
        int resp, contador = 0;
        do {            
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
            vetorAlunos[contador][0] = nomeAluno;
            String idadeAluno = JOptionPane.showInputDialog("Digite a idade do aluno:");
            vetorAlunos[contador][1] = idadeAluno;
            String notaAluno = JOptionPane.showInputDialog("Digite a nota do aluno:");
            vetorAlunos[contador][2] = notaAluno;
            somaNotas+=Double.parseDouble(notaAluno);
            contador++;
            resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais alunos? Espaco " + contador + "|" + vetorAlunos.length);
         
        } while (resp != 1 & contador < vetorAlunos.length);
        double mediaNotas = somaNotas/contador;
        for(int linha = 0;linha < vetorAlunos.length;linha++){
            
            JOptionPane.showMessageDialog(null, "Aluno " + linha + "= Nome: " + vetorAlunos[linha][0] + " Idade: " + vetorAlunos[linha][1] + " Nota: " + vetorAlunos[linha][2]);
        }
        JOptionPane.showMessageDialog(null, "Media das notas: " + mediaNotas);
        
    }
    
    
    
}
